package inkant1990gmail.com.laliga.screen.table.goalsList

import android.databinding.ObservableField
import inkant1990gmail.com.laliga.base.BaseViewModel
import inkant1990gmail.com.laliga.screen.table.TableRouter
import javax.inject.Inject

class GoalsListViewModel @Inject constructor() : BaseViewModel<TableRouter>() {
    val a = ObservableField<String>("")

    init {
        a.set("голы")
    }
}