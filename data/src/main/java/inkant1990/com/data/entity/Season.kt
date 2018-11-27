package inkant1990.com.data.entity

import com.google.gson.annotations.SerializedName

data class Season(

    @field:SerializedName("end_date")
    val endDate: String? = null,

    @field:SerializedName("year")
    val year: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("start_date")
    val startDate: String? = null,

    @field:SerializedName("tournament_id")
    val tournamentId: String? = null
)