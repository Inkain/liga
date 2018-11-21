package inkant1990.com.domain.repository

import inkant1990.com.domain.entity.rankings.Rankings
import io.reactivex.Flowable


interface PlayerRankinsRepository {
    fun getScorers(): Flowable<List<Rankings>>
    fun getAssists(): Flowable<List<Rankings>>
    fun getYellows(): Flowable<List<Rankings>>
    fun getReds(): Flowable<List<Rankings>>
}