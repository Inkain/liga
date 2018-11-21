package inkant1990.com.domain.entity.rankings

import inkant1990.com.domain.entity.Entity

data class TopScorers(
    val score: Int? = null,
    val rank: Int? = null,
    val teamName: String? = null,
    val teamId:String?=null,
    val playerName: String? = null,
    val playerID:String?=null
):Entity