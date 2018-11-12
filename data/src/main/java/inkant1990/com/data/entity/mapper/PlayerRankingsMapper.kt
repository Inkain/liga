package inkant1990.com.data.entity.mapper

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.domain.entity.rankings.TopAssists
import inkant1990.com.domain.entity.rankings.TopScorers
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PlayerRankingsMapper @Inject constructor() {
    private var assistsList: MutableCollection<TopAssists> = mutableListOf()
    private var scorersList: MutableCollection<TopScorers> = mutableListOf()

    fun transforScorers(rankingsResponse: RankingsResponse): MutableCollection<TopScorers> {
        rankingsResponse.topGoals?.forEach {
            if (it != null&& it.rank!!.toInt() <= 35){
            scorersList.add(
                TopScorers(it.goals, it.rank, it.team?.name, it.team?.id, it.player?.name, it.player?.id)
            )}
        }
        return scorersList
    }

    fun transforAssists(rankingsResponse: RankingsResponse): MutableCollection<TopAssists> {
        rankingsResponse.topAssists?.forEach {
            if (it != null&& it.rank!!.toInt() <= 35)  assistsList.add(
                TopAssists(it.assists, it.rank, it.team?.name, it.team?.id, it.player?.name, it.player?.id)
            )
        }
        return assistsList
    }
}