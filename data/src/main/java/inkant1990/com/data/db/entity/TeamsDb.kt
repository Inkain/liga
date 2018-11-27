package inkant1990.com.data.db.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class TeamsDb(
    val name: String? = null,
    @PrimaryKey
    val id: String
)