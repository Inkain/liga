package inkant1990gmail.com.laliga.screen.table.standingsList

import android.util.Log
import inkant1990.com.domain.interactor.GetStandingsList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.table.TableRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class StandingsListViewModel @Inject constructor(
    getStandingsList: GetStandingsList,
    val adapter: StandingsListAdapter
) : BaseViewModel<TableRouter>() {

    init {
        adapter.setOnItemClickListener(object : StandingsListAdapter.OnItemClickListener {
            override fun onClick(id: String) {
                router?.goToTeamProfileActivity(id)
            }
        })

          addToDisposable(getStandingsList.execute(Unit).subscribeBy(
            onNext = {
                adapter.setData(it)
                adapter.notifyDataSetChanged()
            }
          ,onError = {Log.v("myLogs",it.cause.toString())}
        )
        )

    }

}