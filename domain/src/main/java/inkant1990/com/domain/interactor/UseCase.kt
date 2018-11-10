package inkant1990.com.domain.interactor

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

abstract class UseCase<T, Params> {

    abstract fun buildUseCaseObservable(params: Params): Observable<T>
    fun execute(params: Params): Observable<T> {
        return this.buildUseCaseObservable(params).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

}