package inkant1990gmail.com.laliga.screen.teamProfile.players

import android.databinding.ObservableBoolean
import android.util.Log
import inkant1990.com.domain.interactor.GetTeamProfile
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class PlayersListViewModel @Inject constructor(val useCase: GetTeamProfile, val adapter: PlayersAdapter) :
    BaseViewModel<HomeRouter>() {
    var loading = ObservableBoolean(true)
    var data = ObservableBoolean(false)


    fun startdata(id: String?) {
        addToDisposable(useCase.execute(id!!).subscribeBy(
            onNext = {
                adapter.setData(it.players!!)
                adapter.notifyDataSetChanged()
                loading.set(false)
            },
            onError = {
                Log.v("myLogs", it.toString())
                data.set(true)
            }
        ))
    }


}