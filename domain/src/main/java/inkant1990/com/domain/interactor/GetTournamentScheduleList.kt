package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.schedule.tournamentSchedule.Round
import inkant1990.com.domain.executor.PostExecutorThread
import inkant1990.com.domain.repository.TournamentScheduleRepositoryImpl
import io.reactivex.Flowable
import javax.inject.Inject

class GetTournamentScheduleList@Inject constructor(val scheduleRepositoryImpl: TournamentScheduleRepositoryImpl,
                                                   postExecutorThread: PostExecutorThread) :
    UseCase<List<Round>, Unit>(postExecutorThread) {
    override fun buildUseCaseObservable(params: Unit): Flowable<List<Round>> = scheduleRepositoryImpl.getTournamentSchedule()
}