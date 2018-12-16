package inkant1990gmail.com.laliga.screen.rankings.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import inkant1990.com.domain.entity.rankings.Rankings
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.databinding.RankingsItemsBinding
import javax.inject.Inject

class BaseRankingAdapter @Inject constructor() : RecyclerView.Adapter<BaseRankingAdapter.Holder>() {
    private var list: List<Rankings> = mutableListOf()


    override fun onCreateViewHolder(parent: ViewGroup, layoutId: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<RankingsItemsBinding>(inflater, R.layout.rankings_items, parent, false)
        return Holder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setData(list: List<Rankings>) {
        this.list = list
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(list.get(position))
    }

    inner class Holder(val binding: RankingsItemsBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(obj: Rankings) {
            binding.obj = obj
            binding.executePendingBindings()
        }

    }
}