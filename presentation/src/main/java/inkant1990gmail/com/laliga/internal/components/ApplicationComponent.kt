package inkant1990gmail.com.laliga.internal.components

import android.content.Context
import dagger.Component
import inkant1990.com.domain.repository.StandingsRepository
import inkant1990gmail.com.laliga.screen.table.StandingsTableActivity
import inkant1990gmail.com.laliga.internal.modules.ApplicationModule
import inkant1990gmail.com.laliga.internal.modules.ViewModelModule
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class,ViewModelModule::class])
interface ApplicationComponent {


    fun inject(app: StandingsTableActivity)
    fun standingsRepository(): StandingsRepository
   // fun viewModelFactory():ViewModelProvider.Factory
    fun context(): Context
}

