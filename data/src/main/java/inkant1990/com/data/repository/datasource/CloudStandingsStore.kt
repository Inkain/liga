package inkant1990.com.data.repository.datasource

import inkant1990.com.data.entity.standing.Response
import inkant1990.com.data.net.ApiGet
import javax.inject.Inject


class CloudStandingsStore @Inject constructor(private val apiGet: ApiGet) : DataStore<Response> {

    override fun getData() = apiGet.getStandingsData()

}