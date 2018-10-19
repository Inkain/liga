package inkant1990.com.data.entity.standing

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team


data class TeamStandingsItem(

    @field:SerializedName("loss")
    val loss: Int? = null,

    @field:SerializedName("goals_against")
    val goalsAgainst: Int? = null,

    @field:SerializedName("change")
    val change: Int? = null,

    @field:SerializedName("rank")
    val rank: Int? = null,

    @field:SerializedName("team")
    val team: Team? = null,

    @field:SerializedName("draw")
    val draw: Int? = null,

    @field:SerializedName("played")
    val played: Int? = null,

    @field:SerializedName("win")
    val win: Int? = null,

    @field:SerializedName("goal_diff")
    val goalDiff: Int? = null,

    @field:SerializedName("goals_for")
    val goalsFor: Int? = null,

    @field:SerializedName("points")
    val points: Int? = null
)