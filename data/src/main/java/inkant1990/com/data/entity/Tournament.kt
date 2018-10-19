package inkant1990.com.data.entity

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Tournament(

	@field:SerializedName("current_season")
	val currentSeason: Season? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("sport")
	val sport:Sport? = null
)