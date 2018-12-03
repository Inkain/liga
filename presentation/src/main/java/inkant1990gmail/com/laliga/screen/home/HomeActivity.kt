package inkant1990gmail.com.laliga.screen.home

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.view.ViewCompat
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmActivity
import inkant1990gmail.com.laliga.databinding.HomeActivityBinding
import kotlinx.android.synthetic.main.home_activity.*
import android.content.SharedPreferences



class HomeActivity :
    BaseMvvmActivity<HomeViewModel, HomeActivityBinding, HomeRouter>() {
    var isFirstStart:Boolean =true
    val MY_PREFS_NAME = "MyPrefsFile"

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
        router.goToTable()
        getPreferences()
        if (isFirstStart) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                shadowView.visibility= View.VISIBLE
                btTable.elevation = 10f
                btTable.isEnabled=false
                btInfo.isEnabled=false
                btSchedule.isEnabled=false
                btStats.isEnabled=false
                tipTable.visibility= View.VISIBLE

            }
        }
    }


    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun tipClick(v:View){
        when(v.id){
            tipTable.id ->{
                btTable.elevation = 0f
                tipTable.visibility=View.GONE
                btStats.elevation=10f
                tipStats.visibility=View.VISIBLE
            }
            tipSchedule.id ->{
                btSchedule.elevation = 0f
                tipSchedule.visibility=View.GONE
                btInfo.elevation=10f
                tipClubs.visibility=View.VISIBLE
            }
            tipClubs.id ->{
                tipClubs.visibility=View.GONE
                btInfo.elevation=0f
                btTable.isEnabled=true
                btInfo.isEnabled=true
                btSchedule.isEnabled=true
                btStats.isEnabled=true
                isFirstStart=false
                shadowView.visibility= View.GONE
                savePreferences()
            }
            tipStats.id ->{
                btStats.elevation = 0f
                tipStats.visibility=View.GONE
                btSchedule.elevation=10f
                tipSchedule.visibility=View.VISIBLE
            }
        }

    }
    fun savePreferences(){
        val editor = getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE).edit()
        editor.putBoolean("isFirst", isFirstStart)
        editor.apply()
    }
    fun getPreferences(){
        val prefs = getSharedPreferences(MY_PREFS_NAME, Context.MODE_PRIVATE)
        isFirstStart = prefs.getBoolean("isFirst", true)
    }


}
