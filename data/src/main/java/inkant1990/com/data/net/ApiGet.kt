package inkant1990.com.data.net

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.entity.standing.Response
import io.reactivex.Flowable
import io.reactivex.Observable
import javax.inject.Inject

class ApiGet @Inject constructor() {

    private var api: LeagueApi = ApiModule.api()
    fun getStandingsData(): Flowable<Response> {
        return api.getTable()
    }

    fun getRankingsData(): Flowable<RankingsResponse> {
        return api.getPlayerRankings()
    }

    fun getDailyScheduleData():Flowable<inkant1990.com.data.entity.dailyShedule.Response>{
        return  api.getDailySchedule()
    }

}