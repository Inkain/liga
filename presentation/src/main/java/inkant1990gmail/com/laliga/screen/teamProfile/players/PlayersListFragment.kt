package inkant1990gmail.com.laliga.screen.teamProfile.players

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.PlayersListFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter

class PlayersListFragment : BaseMvvmFragment<PlayersListViewModel, HomeRouter, PlayersListFragmentBinding>() {
    companion object {
        fun getInstance(id: String?): PlayersListFragment {
            val bundle = Bundle()
            bundle.putString("id", id)
            val fragment = PlayersListFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)
    }

    override fun prodiveViewModel(): PlayersListViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(PlayersListViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.players_list_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recycle.adapter = viewModel.adapter
        binding.recycle.layoutManager = LinearLayoutManager(context)
        binding.recycle.setHasFixedSize(true)
        viewModel.startdata(arguments?.getString("id"))
    }
}


