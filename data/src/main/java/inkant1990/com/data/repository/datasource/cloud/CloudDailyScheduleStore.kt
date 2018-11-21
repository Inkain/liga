package inkant1990.com.data.repository.datasource.cloud

import inkant1990.com.data.entity.dailyShedule.Response
import inkant1990.com.data.net.ApiGet
import inkant1990.com.data.repository.datasource.DataStore
import io.reactivex.Flowable
import io.reactivex.Observable
import javax.inject.Inject

class CloudDailyScheduleStore@Inject constructor(val apiGet: ApiGet):
    DataStore<Response> {
    override fun getData(): Flowable<Response> {
        return apiGet.getDailyScheduleData()
    }
}