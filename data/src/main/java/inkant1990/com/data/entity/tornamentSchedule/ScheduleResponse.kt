package inkant1990.com.data.entity.tornamentSchedule

import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.SportEventsItem
import inkant1990.com.data.entity.Tournament

data class ScheduleResponse(

    @field:SerializedName("schema")
    val schema: String? = null,

    @field:SerializedName("generated_at")
    val generatedAt: String? = null,

    @field:SerializedName("sport_events")
    val sportEvents: List<SportEventsItem?>? = null,

    @field:SerializedName("tournament")
    val tournament: Tournament? = null
)