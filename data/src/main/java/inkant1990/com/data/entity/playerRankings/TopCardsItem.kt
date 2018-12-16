package inkant1990.com.data.entity.playerRankings

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team

data class TopCardsItem(

    @field:SerializedName("yellow_red_cards")
    val yellowRedCards: Int? = null,

    @field:SerializedName("red_cards")
    val redCards: Int? = null,

    @field:SerializedName("yellow_cards")
    val yellowCards: Int? = null,

    @field:SerializedName("rank")
    val rank: Int? = null,

    @field:SerializedName("team")
    val team: Team? = null,

    @field:SerializedName("player")
    val player: Player
)