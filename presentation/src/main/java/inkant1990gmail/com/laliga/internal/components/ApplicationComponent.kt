package inkant1990gmail.com.laliga.internal.components

import dagger.Component
import inkant1990.com.data.db.dao.StandingsDao
import inkant1990gmail.com.laliga.AndroidApplication
import inkant1990gmail.com.laliga.internal.modules.ApplicationModule
import inkant1990gmail.com.laliga.internal.modules.RoomModule
import inkant1990gmail.com.laliga.internal.modules.ViewModelModule
import inkant1990gmail.com.laliga.screen.dailySchedule.DailyScheduleFragment
import inkant1990gmail.com.laliga.screen.rankings.assistsList.AssistsFragment
import inkant1990gmail.com.laliga.screen.rankings.goalsList.GoalsListFragment
import inkant1990gmail.com.laliga.screen.rankings.redsList.RedListFragment
import inkant1990gmail.com.laliga.screen.rankings.yellowLists.YellowListFragment
import inkant1990gmail.com.laliga.screen.tornamentSchedule.ScheduleFragment
import inkant1990gmail.com.laliga.screen.standings.StandingsListFragment
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class, ViewModelModule::class,RoomModule::class])
interface ApplicationComponent {
    fun inject(application: AndroidApplication)
    fun inject(app: StandingsListFragment)
    fun inject(app: GoalsListFragment)
    fun inject(app: ScheduleFragment)
    fun inject(app: AssistsFragment)
    fun inject(app: DailyScheduleFragment)
    fun inject(app: YellowListFragment)
    fun inject(app: RedListFragment)

}

