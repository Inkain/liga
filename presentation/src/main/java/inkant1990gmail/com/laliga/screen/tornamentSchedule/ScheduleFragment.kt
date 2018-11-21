package inkant1990gmail.com.laliga.screen.tornamentSchedule

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.ScheduleFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter

class ScheduleFragment : BaseMvvmFragment<ScheduleViewModel, HomeRouter, ScheduleFragmentBinding>() {
    companion object {
        fun getInstance() =ScheduleFragment()
    }
    override fun prodiveViewModel(): ScheduleViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(ScheduleViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.schedule_fragment
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

}