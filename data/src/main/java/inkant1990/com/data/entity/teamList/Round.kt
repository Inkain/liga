package inkant1990.com.data.entity.teamList

import com.google.gson.annotations.SerializedName

data class Round(

    @field:SerializedName("number")
    val number: Int? = null,

    @field:SerializedName("type")
    val type: String? = null
)