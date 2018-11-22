package inkant1990gmail.com.laliga.screen.rankings.goalsList

import android.util.Log
import inkant1990.com.domain.interactor.GetScorersList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import inkant1990gmail.com.laliga.screen.rankings.adapters.BaseRankingAdapter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class GoalsListViewModel @Inject constructor(
    private val getScorersList: GetScorersList,
    val adapter: BaseRankingAdapter
) : BaseViewModel<HomeRouter>() {


    init {

     addToDisposable(getScorersList.execute(Unit).subscribeBy(
            onNext = {
                adapter.setData(it)
                adapter.notifyDataSetChanged()
            }
            , onError = { Log.v("myLogs", it.message) })
        )
    }
}