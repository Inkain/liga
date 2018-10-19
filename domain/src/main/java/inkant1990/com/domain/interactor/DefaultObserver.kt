package inkant1990.com.domain.interactor

import io.reactivex.observers.DisposableObserver

abstract class DefaultObserver<T> : DisposableObserver<T>() {
   abstract override fun onComplete()


   abstract override fun onNext(t: T)



  abstract  override fun onError(e: Throwable)


}