package inkant1990.com.data.entity.dailyShedule

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.SportEventsItem

data class Response(

    @field:SerializedName("schema")
    val schema: String? = null,

    @field:SerializedName("generated_at")
    val generatedAt: String? = null,

    @field:SerializedName("sport_events")
    val sportEvents: List<SportEventsItem?>? = null
)