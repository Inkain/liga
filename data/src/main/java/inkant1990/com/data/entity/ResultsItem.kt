package inkant1990.com.data.entity

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.dailyResult.SportEventStatus

@Generated("com.robohorse.robopojogenerator")
data class ResultsItem(

	@field:SerializedName("sport_event_status")
	val sportEventStatus: SportEventStatus? = null,

	@field:SerializedName("sport_event")
	val sportEvent: SportEvent? = null
)