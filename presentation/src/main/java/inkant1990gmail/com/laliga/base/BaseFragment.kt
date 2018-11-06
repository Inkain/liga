package inkant1990gmail.com.laliga.base

import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.Fragment
import inkant1990gmail.com.laliga.AndroidApplication
import inkant1990gmail.com.laliga.internal.components.ApplicationComponent
import javax.inject.Inject


abstract class BaseFragment : Fragment() {

    val appComponent: ApplicationComponent by lazy(mode = LazyThreadSafetyMode.NONE) {
        (activity?.application as AndroidApplication).component
    }
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
}