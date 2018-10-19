package inkant1990.com.domain.repository

import inkant1990.com.domain.entity.rankings.TopAssists
import inkant1990.com.domain.entity.rankings.TopScorers
import io.reactivex.Observable

interface PlayerRankinsRepository {
    fun getScorers(): Observable<MutableCollection<TopScorers>>
    fun getAssists(): Observable<MutableCollection<TopAssists>>
}