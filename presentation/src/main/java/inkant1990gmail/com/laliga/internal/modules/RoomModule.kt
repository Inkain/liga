package inkant1990gmail.com.laliga.internal.modules

import dagger.Module
import dagger.Provides
import inkant1990.com.data.db.AppDataBase
import inkant1990.com.data.db.dao.RankingsDao
import inkant1990.com.data.db.dao.StandingsDao
import inkant1990gmail.com.laliga.AndroidApplication
import javax.inject.Singleton

@Module
class RoomModule {


    @Provides
    @Singleton
    fun standingsDao(): StandingsDao {

        return AppDataBase.getInstance(AndroidApplication.instance.applicationContext).getStandingsDao()
    }

    @Provides
    @Singleton
    fun rankingsDao(): RankingsDao {

        return AppDataBase.getInstance(AndroidApplication.instance.applicationContext).getRankingsDao()
    }


}