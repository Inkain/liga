package inkant1990gmail.com.laliga.internal.components

import dagger.Component
import inkant1990gmail.com.laliga.AndroidApplication
import inkant1990gmail.com.laliga.internal.modules.ApplicationModule
import inkant1990gmail.com.laliga.internal.modules.RoomModule
import inkant1990gmail.com.laliga.internal.modules.ViewModelModule
import inkant1990gmail.com.laliga.screen.rankings.assistsList.AssistsFragment
import inkant1990gmail.com.laliga.screen.rankings.goalsList.GoalsListFragment
import inkant1990gmail.com.laliga.screen.rankings.redsList.RedListFragment
import inkant1990gmail.com.laliga.screen.rankings.yellowLists.YellowListFragment
import inkant1990gmail.com.laliga.screen.standings.StandingsListFragment
import inkant1990gmail.com.laliga.screen.teamList.TeamListFragment
import inkant1990gmail.com.laliga.screen.teamProfile.info.InfoFragment
import inkant1990gmail.com.laliga.screen.teamProfile.players.PlayersListFragment
import inkant1990gmail.com.laliga.screen.teamProfile.statistic.StatisticFragment
import inkant1990gmail.com.laliga.screen.tornamentSchedule.ScheduleFragment
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class, ViewModelModule::class, RoomModule::class])
interface ApplicationComponent {
    fun inject(application: AndroidApplication)
    fun inject(app: StandingsListFragment)
    fun inject(app: GoalsListFragment)
    fun inject(app: ScheduleFragment)
    fun inject(app: AssistsFragment)
    fun inject(app: YellowListFragment)
    fun inject(app: RedListFragment)
    fun inject(app: InfoFragment)
    fun inject(app: StatisticFragment)
    fun inject(app: PlayersListFragment)
    fun inject(app: TeamListFragment)

}

