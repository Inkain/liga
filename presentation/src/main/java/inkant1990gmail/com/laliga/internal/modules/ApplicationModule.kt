package inkant1990gmail.com.laliga.internal.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import inkant1990.com.data.db.AppDataBase
import inkant1990.com.data.db.dao.StandingsDao
import inkant1990.com.data.repository.PlayerRankingsItemRepository
import inkant1990.com.data.repository.ScheduleItemRepository
import inkant1990.com.data.repository.StandingsItemRepository
import inkant1990.com.data.repository.TournamentScheduleItemRepository
import inkant1990.com.domain.repository.PlayerRankinsRepository
import inkant1990.com.domain.repository.ScheduleRepository
import inkant1990.com.domain.repository.StandingsRepository
import inkant1990.com.domain.repository.TournamentScheduleRepository
import inkant1990gmail.com.laliga.AndroidApplication
import org.jetbrains.annotations.NotNull
import javax.inject.Singleton


@Module(
)
class ApplicationModule(private val app: AndroidApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): Context = app

    @Provides
    @NotNull
    @Singleton
    fun standingsRepository(standingsItemRepository: StandingsItemRepository): StandingsRepository {

        return standingsItemRepository
    }

    @Provides
    @NotNull
    @Singleton
    fun rankingsRepository(playerRankinsRepository: PlayerRankingsItemRepository): PlayerRankinsRepository {

        return playerRankinsRepository
    }

    @Provides
    @NotNull
    @Singleton
    fun scheduleRepository(scheduleItemRepository: ScheduleItemRepository): ScheduleRepository {

        return scheduleItemRepository
    }

    @Provides
    @NotNull
    @Singleton
    fun scheduleTournamentRepository(scheduleItemRepository: TournamentScheduleItemRepository): TournamentScheduleRepository {

        return scheduleItemRepository
    }


}