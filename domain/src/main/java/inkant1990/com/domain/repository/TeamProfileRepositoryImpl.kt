package inkant1990.com.domain.repository

import inkant1990.com.domain.entity.teamProfile.TeamProfile
import io.reactivex.Flowable

interface TeamProfileRepositoryImpl {
    fun getTeamProfileData(id:String?):Flowable<TeamProfile>
}