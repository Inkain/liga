package inkant1990.com.data.net

import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.entity.standing.Response
import inkant1990.com.data.entity.teamList.TeamListResponse
import inkant1990.com.data.entity.tornamentSchedule.ScheduleResponse
import io.reactivex.Flowable
import javax.inject.Inject

class ApiGet @Inject constructor() {

    private var api: LeagueApi = ApiModule.api()
    fun getStandingsData(): Flowable<Response> {
        return api.getTable()
    }

    fun getRankingsData(): Flowable<RankingsResponse> {
        return api.getPlayerRankings()
    }

    fun getDailyScheduleData(): Flowable<inkant1990.com.data.entity.dailyShedule.Response> {
        return api.getDailySchedule()
    }

    fun getTournamentSchedule(): Flowable<ScheduleResponse> {
        return api.getTournamentSchedule()
    }

    fun getTeamList():Flowable<TeamListResponse>{
        return api.getTeamList()
    }

}