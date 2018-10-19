package inkant1990.com.data.entity.playerProfile

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team

@Generated("com.robohorse.robopojogenerator")
data class PlayerProfileResponse(

	@field:SerializedName("schema")
	val schema: String? = null,

	@field:SerializedName("teams")
	val teams: List<Team?>? = null,

	@field:SerializedName("generated_at")
	val generatedAt: String? = null,

	@field:SerializedName("roles")
	val roles: List<RolesItem?>? = null,

	@field:SerializedName("player")
	val player: Player? = null,

	@field:SerializedName("statistics")
	val statistics: Statistics? = null
)