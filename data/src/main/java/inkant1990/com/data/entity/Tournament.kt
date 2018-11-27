package inkant1990.com.data.entity

import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("com.robohorse.robopojogenerator")
data class Tournament(

    @field:SerializedName("current_season")
    val currentSeason: CurrentSeason? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("category")
    val category: Category? = null,

    @field:SerializedName("sport")
    val sport: Sport? = null
)