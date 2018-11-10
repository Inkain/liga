package inkant1990gmail.com.laliga.screen.table

import android.content.Intent
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseRouter
import inkant1990gmail.com.laliga.screen.table.rankings.RankingsFragment
import inkant1990gmail.com.laliga.screen.table.scheduleList.ScheduleFragment
import inkant1990gmail.com.laliga.screen.table.standingsList.StandingsListFragment
import inkant1990gmail.com.laliga.screen.teamProfile.TeamProfileActivity
import kotlinx.android.synthetic.main.table_activity.*

class TableRouter(activity: TableActivity) : BaseRouter<TableActivity>(activity) {
    fun goToTeamProfileActivity(teamID: String) {
        val intent = Intent(activity.baseContext, TeamProfileActivity::class.java)
        intent.putExtra("teamID", teamID)
        activity.startActivity(intent)
    }
    fun goToTable(){
    replaceFragment( activity.supportFragmentManager,StandingsListFragment.getInstance(), R.id.homeContainer)
    }
    fun goToStats(){
        replaceFragment( activity.supportFragmentManager,RankingsFragment.getInstance(), R.id.homeContainer)
    }
    fun goToSchedule(){
        replaceFragment( activity.supportFragmentManager,ScheduleFragment.getInstance(), R.id.homeContainer)
    }
}