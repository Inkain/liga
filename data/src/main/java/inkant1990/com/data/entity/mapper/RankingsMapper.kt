package inkant1990.com.data.entity.mapper

import android.util.Log
import inkant1990.com.data.db.entity.TopAssistsDb
import inkant1990.com.data.db.entity.TopCardsDb
import inkant1990.com.data.db.entity.TopScorersDb
import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.domain.entity.rankings.Rankings

fun TopScorersDb.transform(): Rankings {
    return Rankings(score, teamName, teamId, playerName, playerID)
}
fun RankingsResponse.transformScoreToDb(): List<TopScorersDb> {
    val scorersList: MutableList<TopScorersDb> = mutableListOf()
    topGoals?.forEach {
        if (it != null && it.rank!!.toInt() <= 35) {
            scorersList.add(
                TopScorersDb(it.goals, it.team?.name, it.team?.id, it.player.name, it.player.id)
            )
        }
    }
    return scorersList
}
fun RankingsResponse.transformScoreToDomain(): List<Rankings> {
    val scorersList: MutableList<Rankings> = mutableListOf()

    topGoals?.forEach {
        if (it != null && it.rank!!.toInt() <= 35) {
            scorersList.add(
                Rankings(it.goals, it.team?.name, it.team?.id, it.player.name, it.player.id)
            )
        }
    }
    return scorersList
}
fun TopAssistsDb.transform(): Rankings {
    return Rankings(assists,teamName, teamId, playerName, playerID)
}

fun RankingsResponse.transformAssistsToDb(): List<TopAssistsDb> {
    val assistsList: MutableList<TopAssistsDb> = mutableListOf()
    topAssists?.forEach {
        if (it != null && it.rank!!.toInt() <= 35) assistsList.add(
            TopAssistsDb(it.assists,it.team?.name, it.team?.id, it.player.name, it.player.id)
        )
    }
    return assistsList
}

fun RankingsResponse.transformAssistsToDomain(): List<Rankings> {
    val assistsList: MutableList<Rankings> = mutableListOf()
    topAssists?.forEach {
        if (it != null && it.rank!!.toInt() <= 35) assistsList.add(
            Rankings(it.assists, it.team?.name, it.team?.id, it.player.name, it.player.id)
        )
    }
    return assistsList
}

fun RankingsResponse.transformYellowsToDomain(): List<Rankings> {
    val list: MutableList<Rankings> = mutableListOf()
    topCards?.forEach {
        if (it != null && it.yellowCards != 0) {
            list.add(
                Rankings(
                    it.yellowCards,
                    it.team?.name,
                    it.team?.id,
                    it.player.name,
                    it.player.id
                )

            )
        }
    }
    val sortedList = list.sortedByDescending { it.value }
    return sortedList
}

fun RankingsResponse.transformRedsToDomain(): List<Rankings> {
    val list: MutableList<Rankings> = mutableListOf()
    topCards?.forEach {
        if (it != null && it.redCards != 0) {
            list.add(
                Rankings(it.redCards, it.team?.name, it.team?.id, it.player.name, it.player.id)
            )
        }
    }


    val sortedList = list.sortedByDescending { it.value }
    return sortedList
}

fun RankingsResponse.transformCardsToDB(): List<TopCardsDb> {
    val list: MutableList<TopCardsDb> = mutableListOf()
    topCards?.forEach {
        list.add(
            TopCardsDb(it?.redCards, it?.yellowCards, it?.team?.name, it?.team?.id, it?.player?.name, it?.player?.id!!)
        )
    }
    return list
}

fun TopCardsDb.transformYellow(): Rankings {
    return Rankings(yellowCards, teamName, teamId, playerName, playerID)
}

fun TopCardsDb.transformReds(): Rankings {
    return Rankings(redCards, teamName, teamId, playerName, playerID)
}