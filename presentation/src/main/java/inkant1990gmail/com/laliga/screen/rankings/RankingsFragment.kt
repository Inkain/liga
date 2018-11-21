package inkant1990gmail.com.laliga.screen.rankings

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.RankingsFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import inkant1990gmail.com.laliga.screen.rankings.adapters.ViewPagerAdapter
import inkant1990gmail.com.laliga.screen.rankings.assistsList.AssistsFragment
import inkant1990gmail.com.laliga.screen.rankings.goalsList.GoalsListFragment
import inkant1990gmail.com.laliga.screen.rankings.redsList.RedListFragment
import inkant1990gmail.com.laliga.screen.rankings.yellowLists.YellowListFragment

class RankingsFragment : BaseMvvmFragment<RankingsViewModel, HomeRouter, RankingsFragmentBinding>() {
    private lateinit var mPager: ViewPager
    private lateinit var mTabLayout: TabLayout
    private lateinit var mFragments: MutableList<Fragment>

    companion object {
        fun getInstance() = RankingsFragment()
    }

    override fun prodiveViewModel(): RankingsViewModel {
        return ViewModelProviders.of(this).get(RankingsViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.rankings_fragment
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mFragments = mutableListOf()
        mFragments.add(GoalsListFragment.getInstance())
        mFragments.add(AssistsFragment.getInstance())
        mFragments.add(YellowListFragment.getInstance())
        mFragments.add(RedListFragment.getInstance())
        mPager = activity?.findViewById(R.id.vp_fragments_container) as ViewPager
        mPager.setAdapter(ViewPagerAdapter(childFragmentManager, mFragments))
        mTabLayout = activity!!.findViewById(R.id.tl_tabs_container)
        mTabLayout.setupWithViewPager(mPager)

    }
}