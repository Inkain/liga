package inkant1990gmail.com.laliga.screen.table.goalsList

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.GoalsListFragmentBinding
import inkant1990gmail.com.laliga.screen.teamProfile.TeamProfileRouter

class GoalsListFragment : BaseMvvmFragment<GoalsListViewModel, TeamProfileRouter, GoalsListFragmentBinding>() {
    companion object {
        fun getInstance(): GoalsListFragment {
            return GoalsListFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun prodiveViewModel(): GoalsListViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(GoalsListViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.goals_list_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recycleScorers.adapter= viewModel.adapter
        binding.recycleScorers.layoutManager=LinearLayoutManager(context)
        binding.recycleScorers.setHasFixedSize(true)

    }
}