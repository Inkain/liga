package inkant1990.com.data.repository

import inkant1990.com.data.entity.mapper.transform
import inkant1990.com.data.repository.datasource.cloud.CloudDailyScheduleStore
import inkant1990.com.domain.entity.schedule.dailySchedule.DailySchedule
import inkant1990.com.domain.repository.ScheduleRepositoryImpl
import io.reactivex.Flowable
import javax.inject.Inject

class ScheduleItemRepository @Inject constructor(
    val cloud: CloudDailyScheduleStore
) : ScheduleRepositoryImpl {
    override fun getDailySchedule(): Flowable<List<DailySchedule>> {
        return cloud.getData().map { it.transform().toList() }
    }
}