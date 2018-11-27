package inkant1990.com.domain.repository

import inkant1990.com.domain.entity.schedule.tournamentSchedule.Round
import io.reactivex.Flowable

interface TournamentScheduleRepositoryImpl {

    fun getTournamentSchedule(): Flowable<List<Round>>

}