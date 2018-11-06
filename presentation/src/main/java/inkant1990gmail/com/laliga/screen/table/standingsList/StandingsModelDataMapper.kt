package inkant1990gmail.com.laliga.screen.table.standingsList

import inkant1990.com.domain.entity.standings.TeamStandings
import javax.inject.Inject

class StandingsModelDataMapper @Inject constructor() {

    fun transform(t: TeamStandings): StandingsModel {
        val standingsModel = StandingsModel(
            t.loss, t.goalsAgainst, t.change, t.rank, t.draw, t.played,
            t.win, t.goalDiff, t.goalsFor, t.points, t.name, t.id
        )
        return standingsModel
    }

    fun transform(standingsCollection: MutableCollection<TeamStandings>): MutableCollection<StandingsModel> {
        val standingsModelCollection: MutableCollection<StandingsModel> = mutableListOf()
        if (standingsModelCollection.isEmpty()) {
            standingsCollection.forEach {
                standingsModelCollection.add(transform(it))
            }
        } else standingsModelCollection.clear()
        return standingsModelCollection
    }
}