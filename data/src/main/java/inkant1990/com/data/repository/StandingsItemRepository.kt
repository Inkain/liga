package inkant1990.com.data.repository

import android.util.Log
import inkant1990.com.data.db.dao.StandingsDao
import inkant1990.com.data.entity.mapper.transform
import inkant1990.com.data.entity.mapper.transformToDb
import inkant1990.com.data.entity.mapper.transformToDomain
import inkant1990.com.data.repository.datasource.cloud.CloudStandingsStore
import inkant1990.com.domain.entity.standings.TeamStandings
import inkant1990.com.domain.repository.StandingsRepository
import io.reactivex.Flowable
import javax.inject.Inject

class StandingsItemRepository @Inject constructor(
    val cloud: CloudStandingsStore,
    val standingsDao: StandingsDao,
    val utils: Utils
) :
    StandingsRepository {
    companion object {
        const val TIME_BUFER = 50000
    }

    private var lastTimeUpdate = 0L
    override fun standingsItem(): Flowable<List<TeamStandings>> {
        return standingsDao.get()
            .flatMap { standingsDbList ->
                if ((standingsDbList.isEmpty() || utils.getTime() - lastTimeUpdate > TIME_BUFER) && utils.getCoonect()) {
                    cloud.getData()
                        .doOnNext {
                            lastTimeUpdate = utils.getTime()
                            val list = it.transformToDb()
                            standingsDao.deleteAll()
                            standingsDao.insert(list)
                        }
                        .map { it.transformToDomain() }
                        .onErrorReturn {
                            if (standingsDbList.isEmpty()) {

                                throw it;
                            } else {
                                standingsDbList.map { it.transform() }
                            }
                        }
                } else {
                    Flowable.just(standingsDbList).map {
                        it.map {
                            it.transform()
                        }
                    }
                }
            }
    }
}


