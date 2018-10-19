package inkant1990.com.data.entity.teamProfile

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team
import inkant1990.com.data.entity.Venue

@Generated("com.robohorse.robopojogenerator")
data class Response(

	@field:SerializedName("schema")
	val schema: String? = null,

	@field:SerializedName("venue")
	val venue: Venue? = null,

	@field:SerializedName("manager")
	val manager: Manager? = null,

	@field:SerializedName("generated_at")
	val generatedAt: String? = null,

	@field:SerializedName("players")
	val players: List<PlayersItem?>? = null,

	@field:SerializedName("jerseys")
	val jerseys: List<JerseysItem?>? = null,

	@field:SerializedName("team")
	val team: Team? = null,

	@field:SerializedName("statistics")
	val statistics: Statistics? = null
)