package inkant1990.com.data.entity

import com.google.gson.annotations.SerializedName

data class Team(

    @field:SerializedName("country")
    val country: String? = null,

    @field:SerializedName("country_code")
    val countryCode: String? = null,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("category")
    val category: Category? = null,

    @field:SerializedName("abbreviation")
    val abbreviation: String? = null,

    @field:SerializedName("sport")
    val sport: Sport? = null
)