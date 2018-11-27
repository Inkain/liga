package inkant1990.com.data.repository

import android.util.Log
import inkant1990.com.data.db.dao.TournamentScheduleDao
import inkant1990.com.data.entity.mapper.transform
import inkant1990.com.data.entity.mapper.transformToRoundDb
import inkant1990.com.data.entity.mapper.transformToScheduleDb
import inkant1990.com.data.entity.mapper.transformToScheduleToDomain
import inkant1990.com.data.repository.datasource.cloud.CloudTournamentScheduleStore
import inkant1990.com.domain.entity.schedule.tournamentSchedule.Round
import inkant1990.com.domain.repository.TournamentScheduleRepository
import io.reactivex.Flowable
import javax.inject.Inject

class TournamentScheduleItemRepository @Inject constructor(
    val cloud: CloudTournamentScheduleStore,
    val dao: TournamentScheduleDao,
    val utils: Utils
) : TournamentScheduleRepository {
    companion object {
        const val TIME_BUFER = 50000
        private var lastTimeUpdate = 0L
    }

    override fun getTournamentSchedule(): Flowable<List<Round>> {
        return dao.getRounds().flatMap { dbList ->
            if ((dbList.isEmpty() || utils.getTime() - lastTimeUpdate > TIME_BUFER) && utils.getCoonect()) {
                cloud.getData()
                    .doOnNext {
                        lastTimeUpdate = utils.getTime()
                        val list = it.transformToRoundDb()
                        val listR = it.transformToScheduleDb()
                        dao.deleteAllRound()
                        dao.deleteAllSchedule()
                        dao.insertRound(list)
                        dao.insertSchedule(listR)
                    }
                    .map { it.transformToScheduleToDomain() }
                    .onErrorReturn {
                        if (dbList.isEmpty()) {

                            throw it;
                        } else {
                            dbList.map {
                                it.list.forEach {
                                    Log.v("myLogs",it.teamNameHome+" "+it.teamNameAway +" reposi")
                                }
                                it.transform() } as MutableList<Round>?
                        }
                    }
            } else {
                Flowable.just(dbList).map {
                    it.map { schedule ->
                        schedule.list.forEach {
                            Log.v("myLogs",it.teamNameHome+" "+it.teamNameAway +" from db")
                        }

                        schedule.transform()
                    }
                }
            }

        }
    }
}