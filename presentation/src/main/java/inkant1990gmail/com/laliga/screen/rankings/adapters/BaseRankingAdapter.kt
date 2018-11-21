package inkant1990gmail.com.laliga.screen.rankings.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.rankings.TopCards
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.RankingsItemsBinding
import javax.inject.Inject

class BaseRankingAdapter @Inject constructor() : RecyclerView.Adapter<BaseRankingAdapter.Holder>() {
    private lateinit var listener: OnItemClickListener
    private var list: List<TopCards> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, layoutId: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<RankingsItemsBinding>(inflater, R.layout.rankings_items, parent, false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return list.size


    }

    fun setData(list: List<TopCards>) {
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
        holder.bind(list.get(position))
    }

    inner class Holder(val binding: RankingsItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: TopCards) {
            binding.obj = obj
            binding.executePendingBindings()
        }

    }
}