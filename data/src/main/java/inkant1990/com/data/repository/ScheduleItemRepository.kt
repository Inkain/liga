package inkant1990.com.data.repository

import inkant1990.com.data.entity.transform
import inkant1990.com.data.repository.datasource.cloud.CloudDailyScheduleStore
import inkant1990.com.domain.entity.dailySchedule.DailySchedule
import inkant1990.com.domain.repository.ScheduleRepository
import io.reactivex.Flowable
import javax.inject.Inject

class ScheduleItemRepository @Inject constructor(
    val cloud: CloudDailyScheduleStore
) : ScheduleRepository {
    override fun getDailySchedule(): Flowable<List<DailySchedule>> {
        return cloud.getData().map { it.transform().toList() }
    }
}