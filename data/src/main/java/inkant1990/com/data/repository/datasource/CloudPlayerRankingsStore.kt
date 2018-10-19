package inkant1990.com.data.repository.datasource

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.net.ApiGet
import javax.inject.Inject

class CloudPlayerRankingsStore @Inject constructor(val apiGet: ApiGet) : DataStore<RankingsResponse> {

    override fun getData() = apiGet.getRankingsData()
}