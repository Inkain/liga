package inkant1990gmail.com.laliga.screen.tornamentSchedule

import inkant1990.com.domain.interactor.GetTournamentScheduleList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class ScheduleViewModel @Inject constructor(
    getDataList: GetTournamentScheduleList,
    val adapter: TournamentScheduleMainAdapter
) : BaseViewModel<HomeRouter>() {

    init {
        addToDisposable(getDataList.execute(Unit).subscribeBy {
            adapter.setData(it)
            adapter.notifyDataSetChanged()
        })
    }
}