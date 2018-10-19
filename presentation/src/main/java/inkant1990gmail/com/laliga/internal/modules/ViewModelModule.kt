package inkant1990gmail.com.laliga.internal.modules

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import inkant1990gmail.com.laliga.screen.table.StandingsListViewModel
import inkant1990gmail.com.laliga.viewModelFactory.ViewModelFactory
import inkant1990gmail.com.laliga.viewModelFactory.ViewModelKey

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(StandingsListViewModel::class)
    abstract fun standingsViewModel(viewModel: StandingsListViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory):
            ViewModelProvider.Factory

}