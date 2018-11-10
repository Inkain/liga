package inkant1990.com.data.net

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.entity.standing.Response
import io.reactivex.Observable
import retrofit2.http.GET

interface LeagueApi {
    //@GET("XML_dynamic.asp")
    //abstract fun getVal(@Query("date_req1") date_reg1: String, @Query("date_req2") date_reg2: String, @Query("VAL_NM_RQ") Val_NM_RQ: String): Observable<Response>

    @GET("tournaments/sr:tournament:8/standings.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getTable(): Observable<Response>
    @GET("tournaments/sr:tournament:8/leaders.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getPlayerRankings():Observable<RankingsResponse>
}