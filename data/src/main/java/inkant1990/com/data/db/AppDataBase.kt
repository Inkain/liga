package inkant1990.com.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import inkant1990.com.data.db.dao.RankingsDao
import inkant1990.com.data.db.dao.StandingsDao
import inkant1990.com.data.db.entity.StandingsDb
import inkant1990.com.data.db.entity.TopAssistsDb
import inkant1990.com.data.db.entity.TopCardsDb
import inkant1990.com.data.db.entity.TopScorersDb

@Database(entities = [StandingsDb::class, TopScorersDb::class, TopAssistsDb::class,TopCardsDb::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    companion object {
        const val DATABASE_NAME = "sfsfsfsf"
        fun getInstance(context: Context): AppDataBase {
            return Room.databaseBuilder(context, AppDataBase::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration().build()
        }
    }

    abstract fun getStandingsDao(): StandingsDao
    abstract fun getRankingsDao(): RankingsDao

}