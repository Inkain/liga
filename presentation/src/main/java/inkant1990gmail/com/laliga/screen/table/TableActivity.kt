package inkant1990gmail.com.laliga.screen.table

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseActivity
import inkant1990gmail.com.laliga.base.BaseMvvmActivity
import inkant1990gmail.com.laliga.databinding.TableActivityBinding
import inkant1990gmail.com.laliga.screen.table.adapters.ViewPagerAdapter
import inkant1990gmail.com.laliga.screen.table.goalsList.GoalsListFragment
import inkant1990gmail.com.laliga.screen.table.rankings.RankingsFragment
import inkant1990gmail.com.laliga.screen.table.scheduleList.ScheduleFragment
import inkant1990gmail.com.laliga.screen.table.standingsList.StandingsListFragment

class TableActivity :
    BaseMvvmActivity<TableViewModel,TableActivityBinding,TableRouter>() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /*

    />
        */


    }

    override fun prodiveViewModel(): TableViewModel {
        return ViewModelProviders.of(this).get(TableViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.table_activity
    }

    override fun provideRouter(): TableRouter {
       return TableRouter(this)
    }
}
