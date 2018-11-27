package inkant1990gmail.com.laliga.screen.teamList

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.TeamListFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter

class TeamListFragment : BaseMvvmFragment<TeamListViewModel, HomeRouter, TeamListFragmentBinding>() {

    companion object {
        fun getInstance(): TeamListFragment {
            return TeamListFragment()
        }
    }

    override fun prodiveViewModel(): TeamListViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(TeamListViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.team_list_fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        binding.recycle.adapter = viewModel.adapter
        binding.recycle.layoutManager = LinearLayoutManager(context)
        binding.recycle.setHasFixedSize(true)

    }
}