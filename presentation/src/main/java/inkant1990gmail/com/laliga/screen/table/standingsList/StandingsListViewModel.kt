package inkant1990gmail.com.laliga.screen.table.standingsList

import android.databinding.ObservableField
import android.util.Log
import inkant1990.com.domain.entity.standings.TeamStandings
import inkant1990.com.domain.interactor.DefaultObserver
import inkant1990.com.domain.interactor.GetStandingsList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.table.TableRouter
import javax.inject.Inject

class StandingsListViewModel @Inject constructor(
    getStandingsList: GetStandingsList,
    private val standingsModelDataMapper: StandingsModelDataMapper
) : BaseViewModel<TableRouter>() {
    val a = ObservableField<String>("")
    lateinit var standingsList: MutableCollection<StandingsModel>


    init {
        getStandingsList.execute(StandingsObserver(), Unit)
        a.set("таблица")
    }

    inner class StandingsObserver : DefaultObserver<MutableCollection<TeamStandings>>() {
        override fun onNext(t: MutableCollection<TeamStandings>) {
            standingsList = standingsModelDataMapper.transform(t)
            Log.v(("myLogs"), standingsList.size.toString())

        }


        override fun onError(e: Throwable) {


        }

        override fun onComplete() {

        }
    }

}