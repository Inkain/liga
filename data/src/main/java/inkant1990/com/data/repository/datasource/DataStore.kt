package inkant1990.com.data.repository.datasource

import io.reactivex.Observable

interface DataStore<T> {

    fun getData(): Observable<T>
}