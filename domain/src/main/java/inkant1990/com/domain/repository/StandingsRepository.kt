package inkant1990.com.domain.repository

import inkant1990.com.domain.entity.standings.TeamStandings
import io.reactivex.Flowable
import io.reactivex.Observable

interface StandingsRepository {

   fun standingsItem(): Flowable<List<TeamStandings>>
}