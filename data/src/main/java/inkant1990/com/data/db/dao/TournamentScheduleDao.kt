package inkant1990.com.data.db.dao

import android.arch.persistence.room.*
import inkant1990.com.data.db.entity.TournamentScheduleDb
import inkant1990.com.data.db.entity.TournamentScheduleRoundDb
import inkant1990.com.data.entity.tornamentSchedule.Schedule
import io.reactivex.Flowable

@Dao
interface TournamentScheduleDao {

    @Query("SELECT * FROM TournamentScheduleRoundDb")
    fun getRounds(): Flowable<List<Schedule>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertRound(list: List<TournamentScheduleRoundDb>)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertSchedule(list: List<TournamentScheduleDb>)
    @Query("DELETE FROM TournamentScheduleDb")
    fun deleteAllSchedule()
    @Query("DELETE FROM TournamentScheduleRoundDb")
    fun deleteAllRound()
}