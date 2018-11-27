package inkant1990.com.data.entity

import com.google.gson.annotations.SerializedName

data class CompetitorsItem(

    @field:SerializedName("country")
    val country: String? = null,

    @field:SerializedName("country_code")
    val countryCode: String? = null,

    @field:SerializedName("qualifier")
    val qualifier: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("abbreviation")
    val abbreviation: String? = null
)