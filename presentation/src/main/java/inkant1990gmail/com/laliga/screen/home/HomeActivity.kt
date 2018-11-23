package inkant1990gmail.com.laliga.screen.home

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.jakewharton.rxbinding2.view.pressed
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmActivity
import inkant1990gmail.com.laliga.databinding.HomeActivityBinding

class HomeActivity :
    BaseMvvmActivity<HomeViewModel, HomeActivityBinding, HomeRouter>() {


    override fun prodiveViewModel(): HomeViewModel {
        return ViewModelProviders.of(this).get(HomeViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.home_activity
    }

    override fun provideRouter(): HomeRouter {
        return HomeRouter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val btTa =findViewById<View>(R.id.btTable)






       router.goToTable()
    }
}
