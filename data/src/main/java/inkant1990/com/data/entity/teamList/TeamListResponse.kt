package inkant1990.com.data.entity.teamList

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Season
import inkant1990.com.data.entity.Tournament

data class TeamListResponse(

    @field:SerializedName("schema")
    val schema: String? = null,

    @field:SerializedName("round")
    val round: Round? = null,

    @field:SerializedName("generated_at")
    val generatedAt: String? = null,

    @field:SerializedName("season_coverage_info")
    val seasonCoverageInfo: SeasonCoverageInfo? = null,

    @field:SerializedName("season")
    val season: Season? = null,

    @field:SerializedName("groups")
    val groups: List<GroupsItem?>? = null,

    @field:SerializedName("tournament")
    val tournament: Tournament? = null,

    @field:SerializedName("coverage_info")
    val coverageInfo: CoverageInfo? = null
)