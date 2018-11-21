package inkant1990gmail.com.laliga.screen.rankings.assistsList

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.rankings.TopAssists
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.AssistsItemsBinding
import javax.inject.Inject

class AssistsAdapter @Inject constructor(): RecyclerView.Adapter<AssistsAdapter.Holder>() {
    private lateinit var listener: OnItemClickListener
    private var list: List<TopAssists> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, layoutId: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<AssistsItemsBinding>(inflater, R.layout.assists_items, parent, false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return list.size


    }

    fun setData(list: List<TopAssists>) {
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

        }
        holder.bind(list.elementAt(position))
    }

    inner class Holder(val binding: AssistsItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: TopAssists) {
            binding.obj = obj
            binding.executePendingBindings()
        }

    }
}