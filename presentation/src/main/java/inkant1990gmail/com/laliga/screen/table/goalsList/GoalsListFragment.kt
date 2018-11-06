package inkant1990gmail.com.laliga.screen.table.goalsList

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.GoalsListFragmentBinding
import inkant1990gmail.com.laliga.screen.table.TableRouter

class GoalsListFragment : BaseMvvmFragment<GoalsListViewModel, TableRouter, GoalsListFragmentBinding>() {
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
}