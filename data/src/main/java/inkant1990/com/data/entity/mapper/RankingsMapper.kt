package inkant1990.com.data.entity.mapper

import inkant1990.com.data.db.entity.TopAssistsDb
import inkant1990.com.data.db.entity.TopCardsDb
import inkant1990.com.data.db.entity.TopScorersDb
import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.domain.entity.rankings.TopAssists
import inkant1990.com.domain.entity.rankings.TopCards
import inkant1990.com.domain.entity.rankings.TopScorers

fun TopScorersDb.transform(): TopScorers {
    return TopScorers(score, rank, teamName, teamId, playerName, playerID)
}

fun TopAssistsDb.transform(): TopAssists {
    return TopAssists(assists, rank, teamName, teamId, playerName, playerID)
}

fun RankingsResponse.transformScoreToDb(): List<TopScorersDb> {
    val scorersList: MutableList<TopScorersDb> = mutableListOf()
    topGoals?.forEach {
        if (it != null && it.rank!!.toInt() <= 35) {
            scorersList.add(
                TopScorersDb(it.goals, it.rank, it.team?.name, it.team?.id, it.player.name, it.player.id)
            )
        }
    }
    return scorersList
}

fun RankingsResponse.transformScoreToDomain(): List<TopScorers> {
    val scorersList: MutableList<TopScorers> = mutableListOf()

    topGoals?.forEach {
        if (it != null && it.rank!!.toInt() <= 35) {
            scorersList.add(
                TopScorers(it.goals, it.rank, it.team?.name, it.team?.id, it.player.name, it.player.id)
            )
        }
    }
    return scorersList
}

fun RankingsResponse.transformAssistsToDb(): List<TopAssistsDb> {
    val assistsList: MutableList<TopAssistsDb> = mutableListOf()
    topAssists?.forEach {
        if (it != null && it.rank!!.toInt() <= 35) assistsList.add(
            TopAssistsDb(it.assists, it.rank, it.team?.name, it.team?.id, it.player.name, it.player.id)
        )
    }
    return assistsList
}

fun RankingsResponse.transformAssistsToDomain(): List<TopAssists> {
    val assistsList: MutableList<TopAssists> = mutableListOf()
    topAssists?.forEach {
        if (it != null && it.rank!!.toInt() <= 35) assistsList.add(
            TopAssists(it.assists, it.rank, it.team?.name, it.team?.id, it.player.name, it.player.id)
        )
    }
    return assistsList
}

fun RankingsResponse.transformYellowsToDomain(): List<TopCards> {
    val list: MutableList<TopCards> = mutableListOf()
    topCards?.forEach {
        if (it != null && it.yellowCards != 0) {
            list.add(
                TopCards(
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

fun RankingsResponse.transformRedsToDomain(): List<TopCards> {
    val list: MutableList<TopCards> = mutableListOf()
    topCards?.forEach {
        if (it != null && it.redCards != 0) {
            list.add(
                TopCards(it.redCards, it.team?.name, it.team?.id, it.player.name, it.player.id)
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

fun TopCardsDb.transformYellow(): TopCards {
    return TopCards(yellowCards, teamName, teamId, playerName, playerID)
}

fun TopCardsDb.transformReds(): TopCards {
    return TopCards(redCards, teamName, teamId, playerName, playerID)
}