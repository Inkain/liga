package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.schedule.dailySchedule.DailySchedule
import inkant1990.com.domain.repository.ScheduleRepository
import javax.inject.Inject

class GetDailyScheduleList @Inject constructor(val scheduleRepository: ScheduleRepository) :
    UseCase<List<DailySchedule>, Unit>() {
    override fun buildUseCaseObservable(params: Unit) = scheduleRepository.getDailySchedule()
}
