package inkant1990.com.data.repository

import inkant1990.com.data.entity.mapper.transformToDomain
import inkant1990.com.data.repository.datasource.cloud.CloudTeamProfileStore
import inkant1990.com.domain.entity.teamProfile.TeamProfile
import inkant1990.com.domain.repository.TeamProfileRepositoryImpl
import io.reactivex.Flowable
import javax.inject.Inject

class TeamProfileItemRepository @Inject constructor(
    val cloud: CloudTeamProfileStore,
    val utils: Utils
) : TeamProfileRepositoryImpl {
    override fun getTeamProfileData(id: String?): Flowable<TeamProfile> {
        return cloud.getData(id).map { it.transformToDomain() }
    }
}