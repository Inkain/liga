package inkant1990.com.data.entity.teamProfile

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Tournament

data class SeasonsItem(

    @field:SerializedName("form")
    val form: Form? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("tournament")
    val tournament: Tournament? = null,

    @field:SerializedName("statistics")
    val statistics: Statistics? = null
)