package inkant1990.com.data.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity()
data class TournamentScheduleDb(
    @PrimaryKey
    val comp:String,
    val roundOwner: Int?=null,
    val teamNameAway: String? = null,
    val teamIdAway: String? = null,
    val teamNameHome: String? = null,
    val teamIdAwayHome: String? = null,
    val scheduled: String? = null,
    val name: String? = null,
    val capacity: Int?,
    val cityName: String?
)