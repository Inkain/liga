package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.Team
import inkant1990.com.domain.repository.TeamListRepositoryImpl
import io.reactivex.Flowable
import javax.inject.Inject

class GetTeamList @Inject constructor(val repositoryImpl: TeamListRepositoryImpl) :
    UseCase<List<Team>, Unit>() {
    override fun buildUseCaseObservable(params: Unit): Flowable<List<Team>> {
        return repositoryImpl.getTeamList()
    }
}