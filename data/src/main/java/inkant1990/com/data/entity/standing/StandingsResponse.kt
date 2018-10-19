package inkant1990.com.data.entity.standing

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Season
import inkant1990.com.data.entity.Tournament

data class StandingsResponse (

    @field:SerializedName("schema")
    val schema: String? = null,

    @field:SerializedName("generated_at")
    val generatedAt: String? = null,

    @field:SerializedName("season")
    val season: Season? = null,

    @field:SerializedName("tournament")
    val tournament: Tournament? = null,

    @field:SerializedName("data")
    val standings: List<StandingsItem?>? = null
)