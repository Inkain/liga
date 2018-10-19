package inkant1990gmail.com.laliga.internal.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import inkant1990.com.data.repository.StandingsItemRepository
import inkant1990.com.domain.repository.StandingsRepository
import inkant1990gmail.com.laliga.AndroidApplication
import org.jetbrains.annotations.NotNull
import javax.inject.Singleton


@Module(
)
class ApplicationModule(val app: AndroidApplication) {
    @Provides
    fun provideApplicationContext(): Context = app

    @Provides
    @NotNull
    @Singleton
    fun standingsRepository(standingsItemRepository: StandingsItemRepository): StandingsRepository {

        return standingsItemRepository
    }

}