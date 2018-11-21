package inkant1990.com.data.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class StandingsDb(
    val loss: Int?,
    val goalsAgainst: Int?,
    val change: Int?,
    val rank: Int?,
    val draw: Int?,
    val played: Int?,
    val win: Int?,
    val goalDiff: Int?,
    val goalsFor: Int?,
    val points: Int?,
    val name: String?,
    @PrimaryKey
    val id: String
)
