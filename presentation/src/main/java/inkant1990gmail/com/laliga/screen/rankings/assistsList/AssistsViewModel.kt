package inkant1990gmail.com.laliga.screen.rankings.assistsList

import android.util.Log
import inkant1990.com.domain.interactor.GetAssistsList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import inkant1990gmail.com.laliga.screen.rankings.adapters.BaseRankingAdapter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class AssistsViewModel @Inject constructor(
    getData: GetAssistsList,
    val adapter: BaseRankingAdapter
) : BaseViewModel<HomeRouter>() {

    init {

        addToDisposable(getData.execute(Unit).subscribeBy(
            onNext = {
                it.forEach {
                    Log.v("myLogs", it.value.toString()+ it.playerName)
                }
                adapter.setData(it)
                adapter.notifyDataSetChanged()
            }
            , onError = { Log.v("myLogs", it.message) })
        )
    }

}