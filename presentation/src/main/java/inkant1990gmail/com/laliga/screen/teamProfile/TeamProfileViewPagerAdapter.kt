package inkant1990gmail.com.laliga.screen.teamProfile

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class TeamProfileViewPagerAdapter : FragmentPagerAdapter {
    private var mFragments: List<Fragment>? = null

    constructor(fm: FragmentManager) : super(fm) {
        mFragments = ArrayList()
    }

    constructor(fm: FragmentManager, fragments: List<Fragment>) : super(fm) {
        mFragments = fragments
    }

    override fun getItem(position: Int): Fragment {
        return mFragments!![position]
    }

    override fun getCount(): Int {
        return mFragments!!.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        val list = listOf<String>("Info", "Statistic", "Players")
        return list.get(position)
    }
}