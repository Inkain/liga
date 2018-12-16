package inkant1990.com.data.entity

import com.google.gson.annotations.SerializedName


data class Category(

    @field:SerializedName("country_code")
    val countryCode: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: String? = null
)