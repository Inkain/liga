package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.schedule.tournamentSchedule.Round
import inkant1990.com.domain.repository.TournamentScheduleRepository
import io.reactivex.Flowable
import javax.inject.Inject

class GetTournamentSchedule@Inject constructor(val scheduleRepository: TournamentScheduleRepository) :
    UseCase<List<Round>, Unit>() {
    override fun buildUseCaseObservable(params: Unit): Flowable<List<Round>> = scheduleRepository.getTournamentSchedule()
}