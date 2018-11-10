package inkant1990gmail.com.laliga.internal.components

import dagger.Component
import inkant1990gmail.com.laliga.AndroidApplication
import inkant1990gmail.com.laliga.internal.modules.ApplicationModule
import inkant1990gmail.com.laliga.internal.modules.ViewModelModule
import inkant1990gmail.com.laliga.screen.table.goalsList.GoalsListFragment
import inkant1990gmail.com.laliga.screen.table.scheduleList.ScheduleFragment
import inkant1990gmail.com.laliga.screen.table.standingsList.StandingsListFragment
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class, ViewModelModule::class])
interface ApplicationComponent {
    fun inject(application: AndroidApplication)
    fun inject(app: StandingsListFragment)
    fun inject(app: GoalsListFragment)
    fun inject(app: ScheduleFragment)

}

