package inkant1990.com.domain.repository

import inkant1990.com.domain.entity.dailySchedule.DailySchedule
import io.reactivex.Flowable
import io.reactivex.Observable

interface ScheduleRepository {
    fun getDailySchedule(): Flowable<List<DailySchedule>>
}