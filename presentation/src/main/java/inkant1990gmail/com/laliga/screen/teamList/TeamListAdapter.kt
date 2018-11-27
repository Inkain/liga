package inkant1990gmail.com.laliga.screen.teamList

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.Team
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.TeamListItemBinding
import javax.inject.Inject

class TeamListAdapter @Inject constructor() : RecyclerView.Adapter<TeamListAdapter.Holder>() {
    private var list: List<Team> = mutableListOf()
    private lateinit var listener: OnItemClickListener

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val layoutInflater = LayoutInflater.from(p0.getContext())
        val binding = DataBindingUtil.inflate<TeamListItemBinding>(
            layoutInflater, R.layout.team_list_item, p0, false
        )
        return Holder(binding)
    }

    fun setData(list: List<Team>) {
        this.list = list

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener {
            listener.onClick(list.elementAt(position).id!!)
        }
        holder.bind(list.elementAt(position))
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    interface OnItemClickListener {
        fun onClick(id: String)
    }

    inner class Holder(val binding: TeamListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: Team) {
            binding.obj = obj
            binding.executePendingBindings()
        }
    }
}