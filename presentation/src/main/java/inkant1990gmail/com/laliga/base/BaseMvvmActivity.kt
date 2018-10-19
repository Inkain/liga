package inkant1990gmail.com.laliga.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import inkant1990gmail.com.laliga.BR
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

abstract class BaseMvvmActivity<VM : BaseViewModel<R>,
        B : ViewDataBinding, R : BaseRouter<*>> : BaseActivity() {

    protected lateinit var viewModel: VM
    protected lateinit var binding: B
    lateinit var router: R
    protected val compositeDisposable: CompositeDisposable by lazy {
        CompositeDisposable()

    }

    abstract fun prodiveViewModel(): VM

    abstract fun provideLayoutId(): Int
    abstract fun provideRouter(): R
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = prodiveViewModel()
        binding = DataBindingUtil.setContentView(this, provideLayoutId())
        binding.setVariable(BR.viewModel, viewModel)
        router = provideRouter()
    }

    override fun onResume() {
        super.onResume()
        viewModel.addRouter(router)

    }

    override fun onPause() {
        super.onPause()
        viewModel.removeRouter()
        compositeDisposable.clear()
    }

    protected fun addToDisposable(disposable: Disposable) = compositeDisposable.add(disposable)
}