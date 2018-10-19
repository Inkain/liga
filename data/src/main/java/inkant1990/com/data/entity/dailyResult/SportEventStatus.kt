package inkant1990.com.data.entity.dailyResult

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class SportEventStatus(

	@field:SerializedName("home_score")
	val homeScore: Int? = null,

	@field:SerializedName("away_score")
	val awayScore: Int? = null,

	@field:SerializedName("winner_id")
	val winnerId: String? = null,

	@field:SerializedName("period_scores")
	val periodScores: List<PeriodScoresItem?>? = null,

	@field:SerializedName("match_status")
	val matchStatus: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)