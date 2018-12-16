package inkant1990gmail.com.laliga.screen.teamProfile.statistic

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.util.Log
import inkant1990.com.domain.interactor.GetTeamProfile
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class StatisticViewModel @Inject constructor(val useCase: GetTeamProfile) : BaseViewModel<HomeRouter>() {
    var matchesPlayed = ObservableField<String>("")
    var goalsScored = ObservableField<String>("")
    var matchesLost = ObservableField<String>("")
    var groupPosition = ObservableField<String>("")
    var matchesWon = ObservableField<String>("")
    var goalsConceded = ObservableField<String>("")
    var matchesDrawn = ObservableField<String>("")
    var data = ObservableBoolean(false)
    var loading = ObservableBoolean(true)

    fun startdata(id: String?) {
        addToDisposable(useCase.execute(id!!).subscribeBy(
            onNext = {
                matchesPlayed.set(it.statistic?.matchesPlayed.toString())
                goalsScored.set(it.statistic?.goalsScored.toString())
                matchesLost.set(it.statistic?.matchesLost.toString())
                groupPosition.set(it.statistic?.groupPosition.toString())
                matchesWon.set(it.statistic?.matchesWon.toString())
                goalsConceded.set(it.statistic?.goalsConceded.toString())
                matchesDrawn.set(it.statistic?.matchesDrawn.toString())
                loading.set(false)

            },
            onError = {
                Log.v("myLogs", it.toString())
                data.set(true)
            }
        ))
    }
}