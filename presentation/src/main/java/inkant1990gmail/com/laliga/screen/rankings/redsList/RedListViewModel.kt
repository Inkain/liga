package inkant1990gmail.com.laliga.screen.rankings.redsList

import android.util.Log
import inkant1990.com.domain.interactor.GetRedsCardsList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import inkant1990gmail.com.laliga.screen.rankings.adapters.BaseRankingAdapter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class RedListViewModel @Inject constructor(
    getData: GetRedsCardsList,
    val adapter: BaseRankingAdapter
) : BaseViewModel<HomeRouter>() {


    init {


        addToDisposable(getData.execute(Unit).subscribeBy(
            onNext = {
                adapter.setData(it)
                adapter.notifyDataSetChanged()
            }
            , onError = { Log.v("myLogs", it.message + "cardR") })
        )
    }
}