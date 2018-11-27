package inkant1990.com.data.entity.teamProfile

import com.google.gson.annotations.SerializedName

data class Form(

    @field:SerializedName("total")
    val total: String? = null,

    @field:SerializedName("away")
    val away: String? = null,

    @field:SerializedName("home")
    val home: String? = null
)