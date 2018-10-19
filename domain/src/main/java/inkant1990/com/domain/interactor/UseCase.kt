package inkant1990.com.domain.interactor

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.disposables.Disposables
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

abstract class UseCase<T, Params> {
    private val disposables = CompositeDisposable()
    abstract fun buildUseCaseObservable(params: Params): Observable<T>
    private var disposable = Disposables.empty()

    fun execute(observer: DisposableObserver<T>, params: Params) {
        if (!disposable.isDisposed()) {
            disposable.dispose()
        }

        disposable = this.buildUseCaseObservable(params).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread()).subscribeWith(observer)
    }

    fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

    @Override
    fun onStop() {
        if (!disposable.isDisposed) {
            disposable.dispose()
        }
    }
}