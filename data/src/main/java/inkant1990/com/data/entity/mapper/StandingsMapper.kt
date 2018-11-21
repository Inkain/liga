package inkant1990.com.data.entity.mapper

import inkant1990.com.data.db.entity.StandingsDb
import inkant1990.com.data.entity.standing.Response
import inkant1990.com.domain.entity.standings.TeamStandings

fun StandingsDb.transform(): TeamStandings {
    return TeamStandings(loss, goalsAgainst, change, rank, draw, played, win, goalDiff, goalsFor, points, name, id)
}

fun Response.transformToDb(): List<StandingsDb> {
    val list: MutableList<StandingsDb> = mutableListOf()

    standings.get(0)?.groups?.get(0)!!.teamStandings!!.forEach {
        if (it != null) {
            list.add(
                StandingsDb(
                    it.loss, it.goalsAgainst, it.change, it.rank, it.draw,
                    it.played, it.win, it.goalDiff, it.goalsFor, it.points, it.team.name, it.team.id
                )
            )
        }

    }
    return list
}

fun Response.transformToDomain(): List<TeamStandings> {
    val list: MutableList<TeamStandings> = mutableListOf()
    standings.get(0)?.groups?.get(0)!!.teamStandings!!.forEach {
        if (it != null) {
            list.add(TeamStandings(
                it.loss, it.goalsAgainst, it.change, it.rank, it.draw,
                it.played, it.win, it.goalDiff, it.goalsFor, it.points, it.team.name, it.team.id
            ))
        }
    }
    return list
}
