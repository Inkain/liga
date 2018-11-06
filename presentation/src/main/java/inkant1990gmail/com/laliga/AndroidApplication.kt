package inkant1990gmail.com.laliga

import android.app.Application
import inkant1990gmail.com.laliga.internal.components.DaggerApplicationComponent
import inkant1990gmail.com.laliga.internal.modules.ApplicationModule


class AndroidApplication : Application() {


    val component by lazy(mode = LazyThreadSafetyMode.NONE) {
        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        injectMembers()
    }

    private fun injectMembers() = component.inject(this)
}