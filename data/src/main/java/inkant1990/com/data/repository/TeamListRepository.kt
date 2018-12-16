package inkant1990.com.data.repository

import inkant1990.com.data.db.dao.TeamDao
import inkant1990.com.data.entity.mapper.tranform
import inkant1990.com.data.entity.mapper.transformToDb
import inkant1990.com.data.entity.mapper.transformToDomain
import inkant1990.com.data.repository.datasource.cloud.CloudTeamListStore
import inkant1990.com.domain.entity.Team
import inkant1990.com.domain.repository.TeamListRepositoryImpl
import io.reactivex.Flowable
import javax.inject.Inject

class TeamListRepository @Inject constructor(
    val cloud: CloudTeamListStore,
    val dao: TeamDao,
    val utils: Utils
) : TeamListRepositoryImpl {
    companion object {
        const val TIME_BUFER = 5000000
        private var lastTimeUpdate = 0L
    }


    override fun getTeamList(): Flowable<List<Team>> {
        return dao.get()
            .flatMap { dbList ->
                if ((dbList.isEmpty() || (utils.getTime() - lastTimeUpdate) > TIME_BUFER) && utils.getCoonect()) {
                    cloud.getData(null)
                        .doOnNext {
                            lastTimeUpdate = utils.getTime()
                            val list = it.transformToDb()
                            dao.deleteAll()
                            dao.insert(list)
                        }
                        .map { it.transformToDomain() }
                        .onErrorReturn {
                            if (dbList.isEmpty()) {

                                throw it;
                            } else {
                                dbList.map { it.tranform() }
                            }
                        }
                } else {
                    Flowable.just(dbList).map {
                        it.map {
                            it.tranform()
                        }
                    }
                }
            }
    }
}
