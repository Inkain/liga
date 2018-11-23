package inkant1990.com.data.repository.datasource.cloud

import inkant1990.com.data.entity.tornamentSchedule.ScheduleResponse
import inkant1990.com.data.net.ApiGet
import inkant1990.com.data.repository.datasource.DataStore
import io.reactivex.Flowable
import javax.inject.Inject

class CloudTournamentScheduleStore @Inject constructor(private val apiGet: ApiGet) :
    DataStore<ScheduleResponse> {

    override fun getData(): Flowable<ScheduleResponse> {
        return apiGet.getTournamentSchedule()
    }
}
