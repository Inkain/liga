package inkant1990.com.data.entity.liveResults

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class SportEventStatus(

	@field:SerializedName("period")
	val period: Int? = null,

	@field:SerializedName("home_score")
	val homeScore: Int? = null,

	@field:SerializedName("away_score")
	val awayScore: Int? = null,

	@field:SerializedName("clock")
	val clock: Clock? = null,

	@field:SerializedName("aggregate_home_score")
	val aggregateHomeScore: Int? = null,

	@field:SerializedName("match_status")
	val matchStatus: String? = null,

	@field:SerializedName("status")
	val status: String? = null,

	@field:SerializedName("aggregate_away_score")
	val aggregateAwayScore: Int? = null,

	@field:SerializedName("period_scores")
	val periodScores: List<PeriodScoresItem?>? = null
)