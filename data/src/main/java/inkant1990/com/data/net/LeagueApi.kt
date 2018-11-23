package inkant1990.com.data.net

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.entity.standing.Response
import inkant1990.com.data.entity.tornamentSchedule.ScheduleResponse
import io.reactivex.Flowable
import io.reactivex.Observable
import retrofit2.http.GET

interface LeagueApi {
    //@GET("XML_dynamic.asp")
    //abstract fun getVal(@Query("date_req1") date_reg1: String, @Query("date_req2") date_reg2: String, @Query("VAL_NM_RQ") Val_NM_RQ: String): Observable<Response>

    @GET("tournaments/sr:tournament:8/standings.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getTable(): Flowable<Response>
    @GET("tournaments/sr:tournament:8/leaders.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getPlayerRankings():Flowable<RankingsResponse>
    @GET("schedules/2018-10-01/schedule.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getDailySchedule():Flowable<inkant1990.com.data.entity.dailyShedule.Response>
    @GET("tournaments/sr:tournament:8/schedule.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getTournamentSchedule():Flowable<ScheduleResponse>
}