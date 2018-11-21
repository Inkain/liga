package inkant1990.com.data.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import inkant1990.com.data.db.entity.StandingsDb
import io.reactivex.Flowable

@Dao
interface StandingsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(standingsDb: List<StandingsDb>)

    @Query("SELECT * FROM StandingsDb")
    fun get(): Flowable<List<StandingsDb>>

    @Query("DELETE FROM StandingsDb")
    fun deleteAll()
}