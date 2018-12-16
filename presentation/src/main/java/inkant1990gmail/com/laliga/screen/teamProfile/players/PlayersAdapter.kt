package inkant1990gmail.com.laliga.screen.teamProfile.players

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.teamProfile.PlayersTeam
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.PlayersItemsBinding
import javax.inject.Inject

class PlayersAdapter @Inject constructor() : RecyclerView.Adapter<PlayersAdapter.Holder>() {
    private var list: List<PlayersTeam> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val layoutInflater = LayoutInflater.from(p0.getContext())
        val binding = DataBindingUtil.inflate<PlayersItemsBinding>(
            layoutInflater, R.layout.players_items, p0, false
        )
        return Holder(binding)
    }

    fun setData(list: List<PlayersTeam>) {
        this.list = list
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list.elementAt(position))
    }


    inner class Holder(val binding: PlayersItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: PlayersTeam) {
            binding.obj = obj
            binding.executePendingBindings()
        }
    }
}