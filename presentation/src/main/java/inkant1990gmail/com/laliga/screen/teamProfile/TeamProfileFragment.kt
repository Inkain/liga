package inkant1990gmail.com.laliga.screen.teamProfile

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.TeamProfileFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import inkant1990gmail.com.laliga.screen.teamProfile.info.InfoFragment
import inkant1990gmail.com.laliga.screen.teamProfile.players.PlayersListFragment
import inkant1990gmail.com.laliga.screen.teamProfile.statistic.StatisticFragment
import kotlinx.android.synthetic.main.rankings_fragment.*


class TeamProfileFragment : BaseMvvmFragment<TeamProfileViewModel, HomeRouter, TeamProfileFragmentBinding>() {
    private lateinit var mPager: ViewPager
    private lateinit var mTabLayout: TabLayout
    private lateinit var mFragments: MutableList<Fragment>

    companion object {
        fun getInstance(id: String): TeamProfileFragment {
            val bundle = Bundle()
            bundle.putString("id", id)
            val fragment = TeamProfileFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun prodiveViewModel(): TeamProfileViewModel {
        return ViewModelProviders.of(this).get(TeamProfileViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.rankings_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mFragments = mutableListOf()
        mFragments.add(InfoFragment.getInstance(arguments?.getString("id")))
        mFragments.add(StatisticFragment.getInstance(arguments?.getString("id")))
        mFragments.add(PlayersListFragment.getInstance(arguments?.getString("id")))
        mPager = vp_fragments_container
        mPager.setAdapter(TeamProfileViewPagerAdapter(childFragmentManager, mFragments))
        mTabLayout = tl_tabs_container
        mTabLayout.setupWithViewPager(mPager)
    }
}