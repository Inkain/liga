package inkant1990gmail.com.laliga.screen.table

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseActivity
import inkant1990gmail.com.laliga.screen.table.adapters.ViewPagerAdapter
import inkant1990gmail.com.laliga.screen.table.goalsList.GoalsListFragment
import inkant1990gmail.com.laliga.screen.table.standingsList.StandingsListFragment
import javax.inject.Inject

class TableActivity :
    BaseActivity() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory
    private lateinit var mPager: ViewPager
    private lateinit var mTabLayout: TabLayout
    private lateinit var mFragments: MutableList<Fragment>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.table_activity)
        mFragments = mutableListOf()
        mFragments.add(StandingsListFragment.getInstance())
        mFragments.add(GoalsListFragment.getInstance())
        mPager = findViewById<View>(R.id.vp_fragments_container) as ViewPager
        mPager.setAdapter(ViewPagerAdapter(supportFragmentManager, mFragments))

        mTabLayout = findViewById(R.id.tl_tabs_container)
        mTabLayout.setupWithViewPager(mPager)


    }

}
