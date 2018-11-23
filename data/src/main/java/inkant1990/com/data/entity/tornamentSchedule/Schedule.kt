package inkant1990.com.data.entity.tornamentSchedule

import android.arch.persistence.room.Relation
import inkant1990.com.data.db.entity.TournamentScheduleDb

data class Schedule( val round: Int?){

    @Relation(parentColumn = "round", entityColumn = "roundOwner")
    lateinit var list:MutableList<TournamentScheduleDb>
}