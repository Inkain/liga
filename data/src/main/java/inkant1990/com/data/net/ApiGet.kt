package inkant1990.com.data.net

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.entity.standing.Response
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class ApiGet @Inject constructor() {

    private var api: LeagueApi = ApiModule.api()
    fun getStandingsData(): Observable<Response> {
        return api.getTable()
    }

    fun getRankingsData(): Observable<RankingsResponse> {
        return api.getPlayerRankings()
    }

}