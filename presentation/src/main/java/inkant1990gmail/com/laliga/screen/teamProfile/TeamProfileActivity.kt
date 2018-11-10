package inkant1990gmail.com.laliga.screen.teamProfile

import android.arch.lifecycle.ViewModelProviders
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmActivity
import inkant1990gmail.com.laliga.databinding.TeamProfileActivityBinding

class TeamProfileActivity : BaseMvvmActivity<TeamProfileViewModel, TeamProfileActivityBinding, TeamProfileRouter>() {
    override fun prodiveViewModel(): TeamProfileViewModel {
        return ViewModelProviders.of(this).get(TeamProfileViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.team_profile_activity
    }

    override fun provideRouter(): TeamProfileRouter {
        return TeamProfileRouter(this)
    }
}