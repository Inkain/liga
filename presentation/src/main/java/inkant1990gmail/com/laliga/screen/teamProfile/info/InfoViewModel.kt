package inkant1990gmail.com.laliga.screen.teamProfile.info

import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import android.util.Log
import inkant1990.com.domain.interactor.GetTeamProfile
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.home.HomeRouter
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject

class InfoViewModel @Inject constructor(val useCase: GetTeamProfile) : BaseViewModel<HomeRouter>() {
    var teamName = ObservableField<String>("")
    var managerName = ObservableField<String>("")
    var managerNationalite = ObservableField<String>("")
    var teamLogo = ObservableField<String>("default")
    var teamStadium = ObservableField<String>("")
    var teamStaiumCapasity = ObservableField<String>("")
    var teamCity = ObservableField<String>("")
    var data = ObservableBoolean(false)
    var loading = ObservableBoolean(true)

    fun startdata(id: String?) {
        addToDisposable(useCase.execute(id!!).subscribeBy(
            onNext = {
                teamName.set(it.team?.name)
                managerName.set(it.manager?.name)
                managerNationalite.set(it.manager?.nationality)
                teamLogo.set(it.team?.id)
                teamStadium.set(it.venue?.name)
                teamStaiumCapasity.set(it.venue?.capacity.toString())
                teamCity.set(it.venue?.cityName)
                loading.set(false)
            },
            onError = {
                Log.v("myLogs", it.toString())
                data.set(true)
            }
        ))
    }
}
