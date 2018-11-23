package inkant1990gmail.com.laliga.screen.dailySchedule

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.schedule.dailySchedule.DailySchedule
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.DailyScheduleItemsBinding
import javax.inject.Inject

class DailyScheduleAdapter @Inject constructor() : RecyclerView.Adapter<DailyScheduleAdapter.Holder>() {
    private var list: MutableCollection<DailySchedule> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val layoutInflater = LayoutInflater.from(p0.getContext())
        val binding = DataBindingUtil.inflate<DailyScheduleItemsBinding>(
            layoutInflater, R.layout.daily_schedule_items, p0, false
        )
        return Holder(binding)
    }

    fun setData(list: MutableCollection<DailySchedule>) {
        this.list = list

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder.bind(list.elementAt(position))
    }

    inner class Holder(val binding: DailyScheduleItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: DailySchedule) {
           
        }
    }
}
