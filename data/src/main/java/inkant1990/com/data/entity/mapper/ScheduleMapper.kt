package inkant1990.com.data.entity.mapper

import inkant1990.com.data.db.entity.TournamentScheduleDb
import inkant1990.com.data.db.entity.TournamentScheduleRoundDb
import inkant1990.com.data.entity.tornamentSchedule.Schedule
import inkant1990.com.data.entity.tornamentSchedule.ScheduleResponse
import inkant1990.com.data.entity.SportEventsItem
import inkant1990.com.domain.entity.schedule.tournamentSchedule.Competitors
import inkant1990.com.domain.entity.schedule.tournamentSchedule.Round

fun ScheduleResponse.transformToScheduleDb(): List<TournamentScheduleDb> {
    val list: MutableList<TournamentScheduleDb> = mutableListOf()
    sportEvents?.forEach {
        if (it != null) {
            list.add(
                TournamentScheduleDb(
                    it.id!!,
                    it.tournamentRound?.number,
                    it.competitors?.get(0)?.name,
                    it.competitors?.get(0)?.id,
                    it.competitors?.get(1)?.name,
                    it.competitors?.get(1)?.id,
                    it.scheduled,
                    it.venue?.name,
                    it.venue?.capacity,
                    it.venue?.cityName
                )
            )
        }
    }
    return list
}

fun ScheduleResponse.transformToRoundDb(): List<TournamentScheduleRoundDb> {
    val list: MutableList<TournamentScheduleRoundDb> = mutableListOf()
    sportEvents?.forEach {

        list.add(
            TournamentScheduleRoundDb(
                it?.tournamentRound?.number
            )
        )

    }
    return list
}


private fun checkInner(id: Int?, list: MutableList<Round>): Boolean {
    var check: Boolean = false
    list.forEach {
        if (it.round.equals(id.toString())) check = true
    }
    return check
}

fun ScheduleResponse.transformToScheduleToDomain(): MutableList<Round> {
    val list: MutableList<Round> = mutableListOf()

    sportEvents?.forEach {
        if (!checkInner(it?.tournamentRound?.number, list)) list.add(
            Round(
               it?.tournamentRound?.number.toString(), nestedOperation(sportEvents, it?.tournamentRound?.number)
            )
        )

    }
    return list
}

private fun nestedOperation(events: List<SportEventsItem?>, id: Int?): MutableList<Competitors> {
    val listCompt: MutableList<Competitors> = mutableListOf()
    events.forEach { nestet ->
        if (nestet?.tournamentRound?.number!!.equals(id)) {
            listCompt.add(
                Competitors(
                    nestet.competitors?.get(0)?.name,
                    nestet.competitors?.get(0)?.id,
                    nestet.competitors?.get(1)?.name,
                    nestet.competitors?.get(1)?.id,
                    nestet.scheduled,
                    nestet.venue?.name,
                    nestet.venue?.capacity,
                    nestet.venue?.cityName
                )
            )
        }
    }
    return listCompt
}

fun Schedule.transform(): Round {
    val listCompt: MutableList<Competitors> = mutableListOf()
    list.forEach {
        listCompt.add(
            Competitors(
                it.teamNameAway,
                it.teamIdAway,
                it.teamNameHome,
                it.teamIdAwayHome,
                it.scheduled,
                it.name,
                it.capacity,
                it.cityName
            )
        )
    }
    return Round(round.toString(), listCompt)
}




