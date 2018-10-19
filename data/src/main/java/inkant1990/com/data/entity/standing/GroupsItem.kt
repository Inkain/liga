package inkant1990.com.data.entity.standing

import com.google.gson.annotations.SerializedName

data class GroupsItem(

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("team_standings")
    val teamStandings: List<TeamStandingsItem?>? = null
)