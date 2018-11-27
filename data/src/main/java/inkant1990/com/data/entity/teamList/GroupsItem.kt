package inkant1990.com.data.entity.teamList

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team

data class GroupsItem(

    @field:SerializedName("teams")
    val teams: List<Team>? = null
)