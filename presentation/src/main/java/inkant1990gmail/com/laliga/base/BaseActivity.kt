package inkant1990gmail.com.laliga.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.FragmentActivity
import dagger.android.support.HasSupportFragmentInjector


abstract class BaseActivity : FragmentActivity(){
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)
    }
}


