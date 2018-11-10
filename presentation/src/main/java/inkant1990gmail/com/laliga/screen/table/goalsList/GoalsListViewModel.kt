package inkant1990gmail.com.laliga.screen.table.goalsList

import android.util.Log
import inkant1990.com.domain.interactor.GetScorersList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.table.TableRouter
import inkant1990gmail.com.laliga.screen.teamProfile.TeamProfileRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class GoalsListViewModel @Inject constructor(
    private val getScorersList: GetScorersList,
    val adapter: GoalsListAdapter
) : BaseViewModel<TeamProfileRouter>() {


    init {

        adapter.setOnItemClickListener(object : GoalsListAdapter.OnItemClickListener {
            override fun onClick(id: String) {
                Log.v("myLogs", "ГОлы клик")
            }
        })

     addToDisposable(getScorersList.execute(Unit).subscribeBy(
            onNext = {
                adapter.setData(it)
                adapter.notifyDataSetChanged()
            }
            , onError = { Log.v("myLogs", it.message) })
        )
    }
}