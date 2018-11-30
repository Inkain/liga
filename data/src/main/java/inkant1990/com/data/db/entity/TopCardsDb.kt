package inkant1990.com.data.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class TopCardsDb(
    val redCards: Int? = null,
    val yellowCards: Int? = null,
    val teamName: String? = null,
    val teamId: String? = null,
    val playerName: String? = null,
    @PrimaryKey
    val playerID: String
) : DataEntity