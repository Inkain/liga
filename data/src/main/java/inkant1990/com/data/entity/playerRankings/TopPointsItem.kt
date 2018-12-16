package inkant1990.com.data.entity.playerRankings

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team


data class TopPointsItem(

    @field:SerializedName("assists")
    val assists: Int? = null,

    @field:SerializedName("rank")
    val rank: Int? = null,

    @field:SerializedName("team")
    val team: Team? = null,

    @field:SerializedName("goals")
    val goals: Int? = null,

    @field:SerializedName("player")
    val player: Player? = null
)