package inkant1990.com.data.entity

import inkant1990.com.data.entity.dailyShedule.Response
import inkant1990.com.domain.entity.dailySchedule.DailySchedule

fun Response.transform(): MutableCollection<DailySchedule> {
    val list: MutableCollection<DailySchedule> = mutableListOf()

    sportEvents?.forEach {
        if (it?.tournament!!.equals("sr:tournament:8")) {

            list.add(
                DailySchedule(
                    it.scheduled!!,
                    it.competitors?.get(1)?.name!!,
                    it.competitors.get(0)?.name!!,
                    it.venue?.name!!,
                    it.competitors.get(1)?.id!!,
                    it.competitors.get(0)?.id!!
                )
            )
        }
    }
    return list

}