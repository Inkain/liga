package inkant1990.com.data.repository

import inkant1990.com.data.entity.mapper.StandingMapper
import inkant1990.com.data.repository.datasource.CloudStandingsStore
import inkant1990.com.domain.repository.StandingsRepository
import javax.inject.Inject

class StandingsItemRepository @Inject constructor(val mapper: StandingMapper, val cloud: CloudStandingsStore) :
    StandingsRepository {
    override fun standingsItem() = cloud.getData().map { it -> this.mapper.transformList(it) }
}