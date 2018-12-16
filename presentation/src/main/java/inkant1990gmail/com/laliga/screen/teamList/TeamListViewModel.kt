package inkant1990gmail.com.laliga.screen.teamList

import inkant1990.com.domain.interactor.GetTeamList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class TeamListViewModel @Inject constructor(
    getData: GetTeamList,
    val adapter: TeamListAdapter
) : BaseViewModel<HomeRouter>() {
    init {
        adapter.setOnItemClickListener(object : TeamListAdapter.OnItemClickListener {
            override fun onClick(id: String) {
                router?.goToTeamProfileFragment(id)
            }
        })
        addToDisposable(getData.execute(Unit).subscribeBy {
            adapter.setData(it)
            adapter.notifyDataSetChanged()
        })
    }
}