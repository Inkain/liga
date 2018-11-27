package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.schedule.dailySchedule.DailySchedule
import inkant1990.com.domain.executor.PostExecutorThread
import inkant1990.com.domain.repository.ScheduleRepositoryImpl
import javax.inject.Inject

class GetDailyScheduleList @Inject constructor(
    val scheduleRepository: ScheduleRepositoryImpl,
    postExecutorThread: PostExecutorThread
) :
    UseCase<List<DailySchedule>, Unit>(postExecutorThread) {
    override fun buildUseCaseObservable(params: Unit) = scheduleRepository.getDailySchedule()
}
