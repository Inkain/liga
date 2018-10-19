package inkant1990.com.data.entity

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Category
import inkant1990.com.data.entity.Sport

@Generated("com.robohorse.robopojogenerator")
data class Team(

	@field:SerializedName("country")
	val country: String? = null,

	@field:SerializedName("country_code")
	val countryCode: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("category")
	val category: Category? = null,

	@field:SerializedName("abbreviation")
	val abbreviation: String? = null,

	@field:SerializedName("sport")
	val sport: Sport? = null
)