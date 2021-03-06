package inkant1990gmail.com.laliga.screen.standings

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.standings.TeamStandings
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.StandingsItemsBinding
import javax.inject.Inject

class StandingsListAdapter @Inject constructor() : RecyclerView.Adapter<StandingsListAdapter.Holder>() {
    private var list: List<TeamStandings> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val layoutInflater = LayoutInflater.from(p0.getContext())
        val binding = DataBindingUtil.inflate<StandingsItemsBinding>(
            layoutInflater, R.layout.standings_items, p0, false
        )
        return Holder(binding)
    }

    fun setData(list: List<TeamStandings>) {
        this.list = list

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list.elementAt(position))
    }

    inner class Holder(val binding: StandingsItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: TeamStandings) {
            binding.obj = obj
            binding.executePendingBindings()
        }
    }
}