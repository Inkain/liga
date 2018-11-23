package inkant1990.com.data.entity.tornamentSchedule

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Tournament

@Generated("com.robohorse.robopojogenerator")
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