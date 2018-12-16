package inkant1990.com.data.repository.datasource.cloud

import inkant1990.com.data.entity.standing.Response
import inkant1990.com.data.net.ApiGet
import inkant1990.com.data.repository.datasource.DataStore
import io.reactivex.Flowable
import javax.inject.Inject


class CloudStandingsStore @Inject constructor(private val apiGet: ApiGet) :
    DataStore<Response> {

    override fun getData(id: String?): Flowable<Response> = apiGet.getStandingsData()

}