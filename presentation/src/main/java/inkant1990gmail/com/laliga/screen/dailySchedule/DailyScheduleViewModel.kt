package inkant1990gmail.com.laliga.screen.dailySchedule

import android.util.Log
import inkant1990.com.domain.interactor.GetDailyScheduleList
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class DailyScheduleViewModel @Inject constructor(
    getData: GetDailyScheduleList,
    val adapter: DailyScheduleAdapter
) : BaseViewModel<HomeRouter>() {
    init {
        addToDisposable(getData.execute(Unit).subscribeBy {
           it.forEach {
               Log.v("myLogs",it.toString())
           }

        })
    }
}