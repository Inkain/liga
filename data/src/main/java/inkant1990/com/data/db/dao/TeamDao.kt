package inkant1990.com.data.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import inkant1990.com.data.db.entity.TeamsDb
import io.reactivex.Flowable

@Dao
interface TeamDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(standingsDb: List<TeamsDb>)

    @Query("SELECT * FROM StandingsDb")
    fun get(): Flowable<List<TeamsDb>>

    @Query("DELETE FROM TeamsDb")
    fun deleteAll()
}