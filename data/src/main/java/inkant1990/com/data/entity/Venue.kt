package inkant1990.com.data.entity

import com.google.gson.annotations.SerializedName

data class Venue(

    @field:SerializedName("map_coordinates")
    val mapCoordinates: String? = null,

    @field:SerializedName("country_code")
    val countryCode: String? = null,

    @field:SerializedName("city_name")
    val cityName: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("country_name")
    val countryName: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("capacity")
    val capacity: Int? = null
)