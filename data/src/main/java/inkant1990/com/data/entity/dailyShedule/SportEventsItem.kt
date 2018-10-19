package inkant1990.com.data.entity.dailyShedule

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.*

@Generated("com.robohorse.robopojogenerator")
data class SportEventsItem(

	@field:SerializedName("venue")
	val venue: Venue? = null,

	@field:SerializedName("competitors")
	val competitors: List<CompetitorsItem?>? = null,

	@field:SerializedName("scheduled")
	val scheduled: String? = null,

	@field:SerializedName("start_time_tbd")
	val startTimeTbd: Boolean? = null,

	@field:SerializedName("tournament_round")
	val tournamentRound: TournamentRound? = null,

	@field:SerializedName("season")
	val season: Season? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tournament")
	val tournament: Tournament? = null,

	@field:SerializedName("status")
	val status: String? = null
)