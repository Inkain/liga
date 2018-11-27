package inkant1990gmail.com.laliga.internal.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import inkant1990.com.data.repository.*
import inkant1990.com.domain.repository.*
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
    @Provides
    @NotNull
    @Singleton
    fun teamListRepository(repository: TeamListRepository): TeamListRepositoryImpl {

        return repository
    }


}