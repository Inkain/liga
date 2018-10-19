package inkant1990.com.data.entity.dailyShedule

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName

@Generated("com.robohorse.robopojogenerator")
data class Response(

	@field:SerializedName("schema")
	val schema: String? = null,

	@field:SerializedName("generated_at")
	val generatedAt: String? = null,

	@field:SerializedName("sport_events")
	val sportEvents: List<SportEventsItem?>? = null
)