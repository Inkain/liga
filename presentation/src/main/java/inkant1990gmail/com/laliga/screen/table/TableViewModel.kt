package inkant1990gmail.com.laliga.screen.table

import android.view.View
import inkant1990gmail.com.laliga.base.BaseViewModel

class TableViewModel

    : BaseViewModel<TableRouter>() {

    fun goToTable(v: View) {
        router?.goToTable()
    }

    fun goToStats(v: View) {
        router?.goToStats()
    }

    fun goToSchedule(v: View) {
        router?.goToSchedule()
    }

}