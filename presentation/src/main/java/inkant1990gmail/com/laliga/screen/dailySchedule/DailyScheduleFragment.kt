package inkant1990gmail.com.laliga.screen.dailySchedule

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.DailyScheduleFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter

class DailyScheduleFragment : BaseMvvmFragment<DailyScheduleViewModel, HomeRouter, DailyScheduleFragmentBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun prodiveViewModel(): DailyScheduleViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(DailyScheduleViewModel::class.java)
    }


    override fun provideLayoutId(): Int {
        return R.layout.daily_schedule_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recycleDailySchedule.adapter = viewModel.adapter
        binding.recycleDailySchedule.layoutManager = LinearLayoutManager(context)
        binding.recycleDailySchedule.setHasFixedSize(true)
    }
}