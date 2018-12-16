package inkant1990gmail.com.laliga.screen.teamProfile.info

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import inkant1990gmail.com.laliga.R
import inkant1990gmail.com.laliga.base.BaseMvvmFragment
import inkant1990gmail.com.laliga.databinding.InfoFragmentBinding
import inkant1990gmail.com.laliga.screen.home.HomeRouter

class InfoFragment : BaseMvvmFragment<InfoViewModel, HomeRouter, InfoFragmentBinding>() {
    companion object {
        fun getInstance(id: String?): InfoFragment {
            val bundle = Bundle()
            bundle.putString("id", id)
            val fragment = InfoFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        appComponent.inject(this)
        super.onCreate(savedInstanceState)

    }

    override fun prodiveViewModel(): InfoViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(InfoViewModel::class.java)
    }

    override fun provideLayoutId(): Int {
        return R.layout.info_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.startdata(arguments?.getString("id"))
    }
}