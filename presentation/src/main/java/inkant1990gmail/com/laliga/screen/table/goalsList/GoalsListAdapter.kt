package inkant1990gmail.com.laliga.screen.table.goalsList

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.rankings.TopScorers
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.GoalsItemsBinding
import javax.inject.Inject

class GoalsListAdapter @Inject constructor() : RecyclerView.Adapter<GoalsListAdapter.Holder>() {
    private lateinit var listener: OnItemClickListener
    private var list: MutableCollection<TopScorers> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, layoutId: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<GoalsItemsBinding>(inflater, R.layout.goals_items, parent, false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return list.size


    }

    fun setData(list: MutableCollection<TopScorers>) {
        this.list.clear()
        this.list = list
    }

    interface OnItemClickListener {
        fun onClick(id: String)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.itemView.setOnClickListener {
            listener.onClick(list.elementAt(position).playerID!!)
        }
        holder.bind(list.elementAt(position))
    }

    inner class Holder(val binding: GoalsItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: TopScorers) {
            binding.obj = obj
            binding.executePendingBindings()
        }

    }
}