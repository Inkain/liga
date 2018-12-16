package inkant1990.com.data.entity.playerRankings

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Tournament


data class RankingsResponse(

    @field:SerializedName("schema")
    val schema: String? = null,

    @field:SerializedName("top_cards")
    val topCards: List<TopCardsItem?>? = null,

    @field:SerializedName("generated_at")
    val generatedAt: String? = null,

    @field:SerializedName("season_coverage_info")
    val seasonCoverageInfo: SeasonCoverageInfo? = null,

    @field:SerializedName("top_assists")
    val topAssists: List<TopAssistsItem?>? = null,

    @field:SerializedName("tournament")
    val tournament: Tournament? = null,

    @field:SerializedName("top_own_goals")
    val topOwnGoals: List<TopOwnGoalsItem?>? = null,

    @field:SerializedName("top_goals")
    val topGoals: List<TopGoalsItem?>? = null,

    @field:SerializedName("top_points")
    val topPoints: List<TopPointsItem?>? = null
)