package inkant1990gmail.com.laliga.screen.tornamentSchedule

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.schedule.tournamentSchedule.Competitors
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.TournamentScheduleNestedItemsBinding
import javax.inject.Inject

class TournamentScheduleNestedAdapter @Inject constructor() :
    RecyclerView.Adapter<TournamentScheduleNestedAdapter.Holder>() {
    private var list:MutableList<Competitors> = mutableListOf()
    private lateinit var listener: OnItemClickListener

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val layoutInflater = LayoutInflater.from(p0.getContext())
        val binding = DataBindingUtil.inflate<TournamentScheduleNestedItemsBinding>(
            layoutInflater, R.layout.tournament_schedule_nested_items, p0, false
        )
        return Holder(binding)
    }

    fun setData(list: List<Competitors>) {
        this.list = list as MutableList<Competitors>

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener {

        }
        holder.bind(list.elementAt(position))
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    interface OnItemClickListener {
        fun onClick(id: String)
    }

    inner class Holder(val binding: TournamentScheduleNestedItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: Competitors) {
            binding.obj = obj
            binding.executePendingBindings()
        }
    }
}


