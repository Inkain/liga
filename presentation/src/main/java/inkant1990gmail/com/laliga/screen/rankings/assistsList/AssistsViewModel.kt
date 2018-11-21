package inkant1990gmail.com.laliga.screen.rankings.assistsList

import android.util.Log
import inkant1990.com.domain.interactor.GetAssistsList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class AssistsViewModel @Inject constructor(
    private val getAssistsList: GetAssistsList,
    val adapter: AssistsAdapter
) : BaseViewModel<HomeRouter>() {

    init {
        adapter.setOnItemClickListener(object : AssistsAdapter.OnItemClickListener {
            override fun onClick(id: String) {
                Log.v("myLogs", "ГОлы клик")
            }
        })

        addToDisposable(getAssistsList.execute(Unit).subscribeBy(
            onNext = {
                adapter.setData(it)
                adapter.notifyDataSetChanged()
            }
            , onError = { Log.v("myLogs", it.message) })
        )
    }

}