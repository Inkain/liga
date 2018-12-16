package inkant1990.com.data.repository.datasource.cloud

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.net.ApiGet
import inkant1990.com.data.repository.datasource.DataStore
import io.reactivex.Flowable
import javax.inject.Inject

class CloudPlayerRankingsStore @Inject constructor(val apiGet: ApiGet) :
    DataStore<RankingsResponse> {

    override fun getData(id: String?): Flowable<RankingsResponse> = apiGet.getRankingsData()
}