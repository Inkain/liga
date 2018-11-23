package inkant1990gmail.com.laliga.screen.tornamentSchedule

import android.util.Log
import inkant1990.com.domain.interactor.GetTournamentSchedule
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class ScheduleViewModel @Inject constructor(
    getStandingsList: GetTournamentSchedule,
    val adapter: TournamentScheduleMainAdapter
):BaseViewModel<HomeRouter>() {

    init {
        addToDisposable(getStandingsList.execute(Unit).subscribeBy {
            it.forEach {
                Log.v("myLogs",it.round)
                it.list.forEach{

                    Log.v("myLogs",it.teamNameAway +" "+ it.teamNameHome)
                }
                }

            adapter.setData(it)
            adapter.notifyDataSetChanged()
        })
    }
}