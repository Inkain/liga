package inkant1990gmail.com.laliga.screen.home

import android.content.Intent
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseRouter
import inkant1990gmail.com.laliga.screen.rankings.RankingsFragment
import inkant1990gmail.com.laliga.screen.tornamentSchedule.ScheduleFragment
import inkant1990gmail.com.laliga.screen.standings.StandingsListFragment
import inkant1990gmail.com.laliga.screen.teamProfile.TeamProfileActivity

class HomeRouter(activity: HomeActivity) : BaseRouter<HomeActivity>(activity) {
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

    fun goToDailySchedule() {
        replaceFragment( activity.supportFragmentManager,ScheduleFragment.getInstance(), R.id.homeContainer)
    }
}