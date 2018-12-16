package inkant1990gmail.com.laliga.screen.standings

import android.util.Log
import inkant1990.com.domain.interactor.GetStandingsList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class StandingsListViewModel @Inject constructor(
    getData: GetStandingsList,
    val adapter: StandingsListAdapter
) : BaseViewModel<HomeRouter>() {

    init {


        addToDisposable(getData.execute(Unit).subscribeBy(
            onNext = {
                adapter.setData(it)
                adapter.notifyDataSetChanged()
            }
            , onError = { Log.v("myLogs", it.cause.toString()) }
        )
        )
    }
}