package inkant1990.com.data.entity.playerRankings

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import inkant1990.com.data.entity.Team

@Generated("com.robohorse.robopojogenerator")
data class TopAssistsItem(

	@field:SerializedName("assists")
	val assists: Int? = null,

	@field:SerializedName("rank")
	val rank: Int? = null,

	@field:SerializedName("team")
	val team: Team? = null,

	@field:SerializedName("player")
	val player: Player? = null
)