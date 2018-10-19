package inkant1990gmail.com.laliga.screen.table

import android.databinding.ObservableField
import android.util.Log
import inkant1990.com.domain.entity.standings.TeamStandings
import inkant1990.com.domain.interactor.DefaultObserver
import inkant1990.com.domain.interactor.GetStandingsList
import inkant1990gmail.com.laliga.base.BaseViewModel
import javax.inject.Inject

class StandingsListViewModel @Inject constructor(
    getStandingsList: GetStandingsList,
    private val standingsModelDataMapper: StandingsModelDataMapper
) : BaseViewModel<StandingsRouter>() {

    lateinit var standingsList: MutableCollection<StandingsModel>


    var team = ObservableField<String>("no data")
    fun start() {
        standingsList.forEach {
            println(team.get().toString())
            team.set(it.toString())
        }

    }

    init {
        getStandingsList.execute(StandingsObserver(),Unit)
    }

    inner class StandingsObserver : DefaultObserver<MutableCollection<TeamStandings>>() {
        override fun onNext(t: MutableCollection<TeamStandings>) {
            standingsList = standingsModelDataMapper.transform(t)
            Log.v(("myLogs"), standingsList.size.toString())
            start()
        }


        override fun onError(e: Throwable) {


        }

        override fun onComplete() {

        }
    }

}