package inkant1990.com.data.entity.teamProfile

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Statistics(

	@field:SerializedName("seasons")
	val seasons: List<SeasonsItem?>? = null,

	@field:SerializedName("matches_played")
	val matchesPlayed: Int? = null,

	@field:SerializedName("goals_scored")
	val goalsScored: Int? = null,

	@field:SerializedName("matches_lost")
	val matchesLost: Int? = null,

	@field:SerializedName("group_position")
	val groupPosition: Int? = null,

	@field:SerializedName("matches_won")
	val matchesWon: Int? = null,

	@field:SerializedName("goals_conceded")
	val goalsConceded: Int? = null,

	@field:SerializedName("matches_drawn")
	val matchesDrawn: Int? = null,

	@field:SerializedName("group_name")
	val groupName: String? = null
)