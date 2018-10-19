package inkant1990.com.data.entity.playerProfile

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team
import inkant1990.com.data.entity.Tournament

@Generated("com.robohorse.robopojogenerator")
data class SeasonsItem(

	@field:SerializedName("season_coverage_info")
	val seasonCoverageInfo: SeasonCoverageInfo? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("team")
	val team: Team? = null,

	@field:SerializedName("tournament")
	val tournament: Tournament? = null,

	@field:SerializedName("statistics")
	val statistics: Statistics? = null
)