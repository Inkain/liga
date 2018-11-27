package inkant1990.com.data.entity.teamProfile

import com.google.gson.annotations.SerializedName

data class Manager(

    @field:SerializedName("country_code")
    val countryCode: String? = null,

    @field:SerializedName("nationality")
    val nationality: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: String? = null
)