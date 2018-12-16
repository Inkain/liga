package inkant1990gmail.com.laliga.screen.teamProfile.statistic

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.StatisticFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter

class StatisticFragment : BaseMvvmFragment<StatisticViewModel, HomeRouter, StatisticFragmentBinding>() {
    companion object {
        fun getInstance(id: String?): StatisticFragment {
            val bundle = Bundle()
            bundle.putString("id", id)
            val fragment = StatisticFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun prodiveViewModel(): StatisticViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(StatisticViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.statistic_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.startdata(arguments?.getString("id"))
    }
}
