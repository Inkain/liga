package inkant1990gmail.com.laliga.screen.home

import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseRouter
import inkant1990gmail.com.laliga.screen.rankings.RankingsFragment
import inkant1990gmail.com.laliga.screen.standings.StandingsListFragment
import inkant1990gmail.com.laliga.screen.teamList.TeamListFragment
import inkant1990gmail.com.laliga.screen.teamProfile.TeamProfileFragment
import inkant1990gmail.com.laliga.screen.tornamentSchedule.ScheduleFragment

class HomeRouter(activity: HomeActivity) : BaseRouter<HomeActivity>(activity) {
    fun goToTeamProfileFragment(teamID: String) {
        replaceFragment(activity.supportFragmentManager, TeamProfileFragment.getInstance(teamID), R.id.homeContainer)
    }

    fun goToTable() {
        replaceFragment(activity.supportFragmentManager, StandingsListFragment.getInstance(), R.id.homeContainer)
    }

    fun goToStats() {
        replaceFragment(activity.supportFragmentManager, RankingsFragment.getInstance(), R.id.homeContainer)
    }

    fun goToSchedule() {
        replaceFragment(activity.supportFragmentManager, ScheduleFragment.getInstance(), R.id.homeContainer)
    }

    fun goToClubList() {
        replaceFragment(activity.supportFragmentManager, TeamListFragment.getInstance(), R.id.homeContainer)
    }
}