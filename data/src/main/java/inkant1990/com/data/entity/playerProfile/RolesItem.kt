package inkant1990.com.data.entity.playerProfile

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team

@Generated("com.robohorse.robopojogenerator")
data class RolesItem(

	@field:SerializedName("active")
	val active: String? = null,

	@field:SerializedName("team")
	val team: Team? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("jersey_number")
	val jerseyNumber: Int? = null,

	@field:SerializedName("end_date")
	val endDate: String? = null,

	@field:SerializedName("start_date")
	val startDate: String? = null
)