package inkant1990gmail.com.laliga.screen.standings

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.StandingsListFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter

class StandingsListFragment : BaseMvvmFragment<StandingsListViewModel, HomeRouter, StandingsListFragmentBinding>() {


    companion object {
        fun getInstance(): StandingsListFragment {
            return StandingsListFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recycleStandings.adapter = viewModel.adapter
        binding.recycleStandings.layoutManager = LinearLayoutManager(context)
        binding.recycleStandings.setHasFixedSize(true)
    }

    override fun prodiveViewModel() =
        ViewModelProviders.of(this, viewModelFactory).get(StandingsListViewModel::class.java)

    override fun provideLayoutId() = R.layout.standings_list_fragment

}