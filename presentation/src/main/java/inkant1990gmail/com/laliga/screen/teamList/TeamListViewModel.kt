package inkant1990gmail.com.laliga.screen.teamList

import inkant1990.com.domain.interactor.GetTeamList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class TeamListViewModel @Inject constructor(
    data: GetTeamList,
    val adapter: TeamListAdapter
) : BaseViewModel<HomeRouter>() {
    init {

        addToDisposable(data.execute(Unit).subscribeBy {
            adapter.setData(it)
            adapter.notifyDataSetChanged()
        })
    }
}