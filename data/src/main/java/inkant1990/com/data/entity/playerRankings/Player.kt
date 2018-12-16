package inkant1990.com.data.entity.playerRankings

import com.google.gson.annotations.SerializedName


data class Player(

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("id")
    val id: String
)