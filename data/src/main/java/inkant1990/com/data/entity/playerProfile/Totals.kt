package inkant1990.com.data.entity.playerProfile

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Totals(

	@field:SerializedName("matches_played")
	val matchesPlayed: Int? = null,

	@field:SerializedName("goals_scored")
	val goalsScored: Int? = null,

	@field:SerializedName("substituted_in")
	val substitutedIn: Int? = null,

	@field:SerializedName("substituted_out")
	val substitutedOut: Int? = null,

	@field:SerializedName("last_event_time")
	val lastEventTime: String? = null,

	@field:SerializedName("assists")
	val assists: Int? = null,

	@field:SerializedName("own_goals")
	val ownGoals: Int? = null,

	@field:SerializedName("yellow_red_cards")
	val yellowRedCards: Int? = null,

	@field:SerializedName("yellow_cards")
	val yellowCards: Int? = null,

	@field:SerializedName("red_cards")
	val redCards: Int? = null
)