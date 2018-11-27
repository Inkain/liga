package inkant1990.com.data.entity

import com.google.gson.annotations.SerializedName

data class TournamentRound(

    @field:SerializedName("phase")
    val phase: String? = null,

    @field:SerializedName("number")
    val number: Int? = null,

    @field:SerializedName("type")
    val type: String? = null
)