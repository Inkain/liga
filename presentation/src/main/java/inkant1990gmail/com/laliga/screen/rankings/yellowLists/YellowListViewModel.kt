package inkant1990gmail.com.laliga.screen.rankings.yellowLists

import android.util.Log
import inkant1990.com.domain.interactor.GetRedsCardsList
import inkant1990.com.domain.interactor.GetYellowCardsList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import inkant1990gmail.com.laliga.screen.rankings.adapters.BaseRankingAdapter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class YellowListViewModel @Inject constructor(
    private val getList: GetYellowCardsList,
    val adapter: BaseRankingAdapter
) : BaseViewModel<HomeRouter>() {


    init {


        addToDisposable(getList.execute(Unit).subscribeBy(
            onNext = {
                adapter.setData(it)
                adapter.notifyDataSetChanged()
            }
            , onError = { Log.v("myLogs", it.message+"cardY") })
        )
    }
}