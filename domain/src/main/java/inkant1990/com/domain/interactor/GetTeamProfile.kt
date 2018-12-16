package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.teamProfile.TeamProfile
import inkant1990.com.domain.executor.PostExecutorThread
import inkant1990.com.domain.repository.TeamProfileRepositoryImpl
import io.reactivex.Flowable
import javax.inject.Inject

class GetTeamProfile @Inject constructor(
    val repository: TeamProfileRepositoryImpl,
    postExecutorThread: PostExecutorThread
) :
    UseCase<TeamProfile, String>(postExecutorThread) {
    override fun buildUseCaseObservable(params: String): Flowable<TeamProfile> = repository.getTeamProfileData(params)
}
