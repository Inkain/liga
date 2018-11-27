package inkant1990gmail.com.laliga.screen.tornamentSchedule

import android.databinding.DataBindingUtil
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.schedule.tournamentSchedule.Round
import inkant1990gmail.com.laliga.AndroidApplication
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.TournamentScheduleMainItemsBinding
import javax.inject.Inject

class TournamentScheduleMainAdapter @Inject constructor() :
    RecyclerView.Adapter<TournamentScheduleMainAdapter.Holder>() {
    private var list:MutableList<Round> = mutableListOf()
    private lateinit var listener: OnItemClickListener

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val layoutInflater = LayoutInflater.from(p0.getContext())
        val binding = DataBindingUtil.inflate<TournamentScheduleMainItemsBinding>(
            layoutInflater, R.layout.tournament_schedule_main_items, p0, false
        )
        return Holder(binding)
    }

    fun setData(list: List<Round>) {
        this.list.clear()
        this.list = list as MutableList<Round>

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


    inner class Holder(
        val binding: TournamentScheduleMainItemsBinding

        ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: Round) {
           val nested =TournamentScheduleNestedAdapter()
            nested.setData(obj.list)
            binding.nestedRecycle.adapter = nested
            binding.nestedRecycle.layoutManager = LinearLayoutManager(AndroidApplication.instance.applicationContext)
            binding.nestedRecycle.setHasFixedSize(true)
            binding.obj = obj
            binding.executePendingBindings()
        }
    }
}