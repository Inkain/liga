package inkant1990.com.data.net

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.entity.standing.Response
import inkant1990.com.data.entity.teamList.TeamListResponse
import inkant1990.com.data.entity.tornamentSchedule.ScheduleResponse
import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Path

interface LeagueApi {

    @GET("tournaments/sr:tournament:8/standings.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getTable(): Flowable<Response>

    @GET("tournaments/sr:tournament:8/leaders.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getPlayerRankings(): Flowable<RankingsResponse>


    @GET("tournaments/sr:tournament:8/schedule.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getTournamentSchedule(): Flowable<ScheduleResponse>

    @GET("tournaments/sr:tournament:8/info.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getTeamList(): Flowable<TeamListResponse>

    @GET("teams/{id}/profile.json?api_key=p759bd77wseaafgn8af4ev9a")
    fun getTeamProfile(@Path("id") id: String?): Flowable<inkant1990.com.data.entity.teamProfile.Response>
}