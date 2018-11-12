package inkant1990gmail.com.laliga.internal.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import inkant1990gmail.com.laliga.screen.table.rankings.assistsList.AssistsViewModel
import inkant1990gmail.com.laliga.screen.table.rankings.goalsList.GoalsListViewModel
import inkant1990gmail.com.laliga.screen.table.scheduleList.ScheduleViewModel
import inkant1990gmail.com.laliga.screen.table.standingsList.StandingsListViewModel
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

}