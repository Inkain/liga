package inkant1990gmail.com.laliga.screen.table.standingsList

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.StandingsListFragmentBinding
import inkant1990gmail.com.laliga.screen.table.TableRouter

class StandingsListFragment : BaseMvvmFragment<StandingsListViewModel, TableRouter, StandingsListFragmentBinding>() {


    companion object {
        fun getInstance(): StandingsListFragment {
            return StandingsListFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)

    }

    override fun prodiveViewModel() =
        ViewModelProviders.of(this, viewModelFactory).get(StandingsListViewModel::class.java)

    override fun provideLayoutId() = R.layout.standings_list_fragment
}