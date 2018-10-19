package inkant1990gmail.com.laliga

import android.app.Application
import inkant1990gmail.com.laliga.internal.components.ApplicationComponent
import inkant1990gmail.com.laliga.internal.components.DaggerApplicationComponent
import inkant1990gmail.com.laliga.internal.modules.ApplicationModule
import inkant1990gmail.com.laliga.internal.modules.ViewModelModule


class AndroidApplication : Application() {

   val component by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()

    }

    fun getApplicationComponent(): ApplicationComponent {
        return this.component
    }

}