package inkant1990.com.data.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import inkant1990.com.data.db.entity.TopAssistsDb
import inkant1990.com.data.db.entity.TopCardsDb
import inkant1990.com.data.db.entity.TopScorersDb
import io.reactivex.Flowable

@Dao
interface RankingsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertScores(standingsDb: List<TopScorersDb>)

    @Query("SELECT * FROM TopScorersDb")
    fun getScores(): Flowable<List<TopScorersDb>>

    @Query("DELETE FROM TopScorersDb")
    fun deleteScores()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAssists(standingsDb: List<TopAssistsDb>)

    @Query("SELECT * FROM TopScorersDb")
    fun getAssists(): Flowable<List<TopAssistsDb>>

    @Query("DELETE FROM TopAssistsDb")
    fun deleteAssists()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCards(standingsDb: List<TopCardsDb>)

    @Query("SELECT teamId,teamName,playerID,playerName,yellowCards FROM TopCardsDb Where yellowCards >0 ORDER BY yellowCards DESC")
    fun getYellows(): Flowable<List<TopCardsDb>>

    @Query("DELETE FROM TopCardsDb")
    fun deleteCards()

    @Query("SELECT teamId,teamName,playerID,playerName,redCards FROM TopCardsDb Where redCards > 0 ORDER BY redCards DESC")
    fun getReds(): Flowable<List<TopCardsDb>>


}