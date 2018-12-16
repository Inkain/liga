package inkant1990.com.data.entity.playerRankings

import com.google.gson.annotations.SerializedName


data class SeasonCoverageInfo(

    @field:SerializedName("max_covered")
    val maxCovered: Int? = null,

    @field:SerializedName("scheduled")
    val scheduled: Int? = null,

    @field:SerializedName("min_coverage_level")
    val minCoverageLevel: String? = null,

    @field:SerializedName("season_id")
    val seasonId: String? = null,

    @field:SerializedName("played")
    val played: Int? = null,

    @field:SerializedName("max_coverage_level")
    val maxCoverageLevel: String? = null
)