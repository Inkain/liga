package inkant1990.com.domain.interactor

import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers


abstract class UseCase<T, Params> {

    abstract fun buildUseCaseObservable(params: Params): Flowable<T>
    fun execute(params: Params): Flowable<T> {
        return this.buildUseCaseObservable(params).take(1).retry(8).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

}