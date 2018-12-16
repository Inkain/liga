package inkant1990gmail.com.laliga.internal.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import inkant1990.com.data.repository.*
import inkant1990.com.domain.executor.PostExecutorThread
import inkant1990.com.domain.repository.*
import inkant1990gmail.com.laliga.AndroidApplication
import inkant1990gmail.com.laliga.executor.UIThread
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
    fun provideStandingsRepository(standingsItemRepository: StandingsItemRepositoryImpl): StandingsRepositoryImpl {

        return standingsItemRepository
    }

    @Provides
    @NotNull
    @Singleton
    fun provideRankingsRepository(playerRankinsRepository: PlayerRankingsItemRepository): PlayerRankingsRepositoryImpl {

        return playerRankinsRepository
    }

    @Provides
    @NotNull
    @Singleton
    fun provideScheduleTournamentRepository(scheduleItemRepository: TournamentScheduleItemRepositoryImpl): TournamentScheduleRepositoryImpl {

        return scheduleItemRepository
    }

    @Provides
    @NotNull
    @Singleton
    fun provideTeamListRepository(repository: TeamListRepository): TeamListRepositoryImpl {

        return repository
    }

    @Provides
    @NotNull
    @Singleton
    fun provideTeamProfileRepository(repository: TeamProfileItemRepository): TeamProfileRepositoryImpl {

        return repository
    }

    @Provides
    @NotNull
    @Singleton
    fun provideUiThread(thread: UIThread): PostExecutorThread {

        return thread
    }

}