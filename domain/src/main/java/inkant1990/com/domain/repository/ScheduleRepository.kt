package inkant1990.com.domain.repository

import inkant1990.com.domain.entity.schedule.dailySchedule.DailySchedule
import io.reactivex.Flowable

interface ScheduleRepository {
    fun getDailySchedule(): Flowable<List<DailySchedule>>
}