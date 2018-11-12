package inkant1990gmail.com.laliga.screen.table

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmActivity
import inkant1990gmail.com.laliga.databinding.TableActivityBinding

class TableActivity :
    BaseMvvmActivity<TableViewModel,TableActivityBinding,TableRouter>() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       /*

    />
        */


    }

    override fun prodiveViewModel(): TableViewModel {
        return ViewModelProviders.of(this).get(TableViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.table_activity
    }

    override fun provideRouter(): TableRouter {
       return TableRouter(this)
    }
}
