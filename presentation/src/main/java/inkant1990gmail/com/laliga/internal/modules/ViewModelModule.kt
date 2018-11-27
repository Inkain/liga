package inkant1990gmail.com.laliga.internal.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import inkant1990gmail.com.laliga.screen.dailySchedule.DailyScheduleViewModel
import inkant1990gmail.com.laliga.screen.rankings.assistsList.AssistsViewModel
import inkant1990gmail.com.laliga.screen.rankings.goalsList.GoalsListViewModel
import inkant1990gmail.com.laliga.screen.rankings.redsList.RedListViewModel
import inkant1990gmail.com.laliga.screen.rankings.yellowLists.YellowListViewModel
import inkant1990gmail.com.laliga.screen.standings.StandingsListViewModel
import inkant1990gmail.com.laliga.screen.teamList.TeamListViewModel
import inkant1990gmail.com.laliga.screen.tornamentSchedule.ScheduleViewModel
import inkant1990gmail.com.laliga.viewModelFactory.ViewModelFactory
import inkant1990gmail.com.laliga.viewModelFactory.ViewModelKey

@Module
abstract class ViewModelModule {


    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory):
            ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(StandingsListViewModel::class)
    abstract fun standingsListViewModel(viewModel: StandingsListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ScheduleViewModel::class)
    abstract fun scheduleListViewModel(viewModel: ScheduleViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(GoalsListViewModel::class)
    abstract fun goalsListViewModel(viewModel: GoalsListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AssistsViewModel::class)
    abstract fun assistsListViewModel(viewModel: AssistsViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DailyScheduleViewModel::class)
    abstract fun dailyScheduleViewModel(viewModel: DailyScheduleViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(YellowListViewModel::class)
    abstract fun yellowListViewModel(viewModel: YellowListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(RedListViewModel::class)
    abstract fun redListViewModel(viewModel: RedListViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(TeamListViewModel::class)
    abstract fun teamListViewModel(viewModel: TeamListViewModel): ViewModel


}