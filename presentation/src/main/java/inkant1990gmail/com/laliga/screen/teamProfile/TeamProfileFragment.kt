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

class TeamProfileFragment : BaseMvvmFragment<TeamProfileViewModel, HomeRouter, TeamProfileFragmentBinding>() {
    private lateinit var mPager: ViewPager
    private lateinit var mTabLayout: TabLayout
    private lateinit var mFragments: MutableList<Fragment>

    companion object {
        fun getInstance(): TeamProfileFragment {
            return TeamProfileFragment()
        }
    }

    override fun prodiveViewModel(): TeamProfileViewModel {
        return ViewModelProviders.of(this).get(TeamProfileViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.team_profile_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}