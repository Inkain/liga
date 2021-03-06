package inkant1990.com.data.repository.datasource

import io.reactivex.Flowable

interface DataStore<T> {

    fun getData(id:String?): Flowable<T>
}