package inkant1990gmail.com.laliga.screen.rankings.yellowLists

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.RankingsListFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter

class YellowListFragment : BaseMvvmFragment<YellowListViewModel, HomeRouter, RankingsListFragmentBinding>() {
    companion object {
        fun getInstance(): YellowListFragment {
            return YellowListFragment()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun prodiveViewModel(): YellowListViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(YellowListViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.rankings_list_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recycle.adapter = viewModel.adapter
        binding.recycle.layoutManager = LinearLayoutManager(context)
        binding.recycle.setHasFixedSize(true)

    }
}
