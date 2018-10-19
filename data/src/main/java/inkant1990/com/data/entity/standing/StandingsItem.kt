package inkant1990.com.data.entity.standing

import com.google.gson.annotations.SerializedName

data class StandingsItem(

    @field:SerializedName("tie_break_rule")
    val tieBreakRule: String? = null,

    @field:SerializedName("groups")
    val groups: List<GroupsItem?>? = null,

    @field:SerializedName("type")
    val type: String? = null
)