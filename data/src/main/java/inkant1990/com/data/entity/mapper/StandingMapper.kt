package inkant1990.com.data.entity.mapper

import inkant1990.com.data.entity.standing.Response
import inkant1990.com.domain.entity.standings.TeamStandings
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class StandingMapper @Inject constructor() {
    var teamStandingsList: MutableCollection<TeamStandings> = mutableListOf()
    fun transformList(response: Response): MutableCollection<TeamStandings> {
        var teamStandings: TeamStandings? = null
        response.standings?.get(0)?.groups?.get(0)!!.teamStandings!!.forEach {
            if (it != null) {
                teamStandings = TeamStandings(
                    it.loss, it.goalsAgainst, it.change, it.rank, it.draw,
                    it.played, it.win, it.goalDiff, it.goalsFor, it.points, it.team?.name, it.team?.id
                )
            }
            teamStandingsList.add(teamStandings!!)
        }
        return teamStandingsList
    }
}