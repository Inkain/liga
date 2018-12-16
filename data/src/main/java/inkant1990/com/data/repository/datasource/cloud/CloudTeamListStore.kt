package inkant1990.com.data.repository.datasource.cloud

import inkant1990.com.data.entity.teamList.TeamListResponse
import inkant1990.com.data.net.ApiGet
import inkant1990.com.data.repository.datasource.DataStore
import io.reactivex.Flowable
import javax.inject.Inject

class CloudTeamListStore @Inject constructor(private val apiGet: ApiGet) :
    DataStore<TeamListResponse> {
    override fun getData(id: String?): Flowable<TeamListResponse> {
        return apiGet.getTeamList()
    }
}