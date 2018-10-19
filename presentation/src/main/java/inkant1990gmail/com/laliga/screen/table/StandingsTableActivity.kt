package inkant1990gmail.com.laliga.screen.table

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import inkant1990gmail.com.laliga.AndroidApplication
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmActivity
import inkant1990gmail.com.laliga.databinding.ActivityStandingsTableBinding
import javax.inject.Inject

class StandingsTableActivity :
    BaseMvvmActivity<StandingsListViewModel, ActivityStandingsTableBinding, StandingsRouter>() {

    @Inject lateinit var factory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidApplication().getApplicationComponent().inject(this)
        super.onCreate(savedInstanceState)

    }

    override fun prodiveViewModel() = ViewModelProviders.of(this, factory).get(StandingsListViewModel::class.java)

    override fun provideLayoutId() = R.layout.activity_standings_table

    override fun provideRouter() = StandingsRouter(this)
}
