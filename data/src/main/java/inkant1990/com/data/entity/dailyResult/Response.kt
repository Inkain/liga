package inkant1990.com.data.entity.dailyResult

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.ResultsItem

@Generated("com.robohorse.robopojogenerator")
data class Response(

	@field:SerializedName("schema")
	val schema: String? = null,

	@field:SerializedName("generated_at")
	val generatedAt: String? = null,

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null
)