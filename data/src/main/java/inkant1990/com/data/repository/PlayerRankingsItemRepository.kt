package inkant1990.com.data.repository

import inkant1990.com.data.entity.mapper.PlayerRankingsMapper
import inkant1990.com.data.repository.datasource.CloudPlayerRankingsStore
import inkant1990.com.domain.entity.rankings.TopScorers
import inkant1990.com.domain.repository.PlayerRankinsRepository
import io.reactivex.Observable
import io.reactivex.rxkotlin.subscribeBy
import javax.inject.Inject


class PlayerRankingsItemRepository @Inject constructor(
    val mapper: PlayerRankingsMapper,
    val cloud: CloudPlayerRankingsStore
) : PlayerRankinsRepository {
    override fun getScorers(): Observable<MutableCollection<TopScorers>> {
        return cloud.getData().map { this.mapper.transforScorers(it) }

    }

    override fun getAssists() = cloud.getData().map { this.mapper.transforAssists(it) }
}
