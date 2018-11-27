package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.standings.TeamStandings
import inkant1990.com.domain.executor.PostExecutorThread
import inkant1990.com.domain.repository.StandingsRepositoryImpl
import io.reactivex.Flowable
import javax.inject.Inject


class GetStandingsList @Inject constructor(
    val standingsRepositoryImpl: StandingsRepositoryImpl,
    postExecutorThread: PostExecutorThread
) :
    UseCase<List<TeamStandings>, Unit>(postExecutorThread) {

    override fun buildUseCaseObservable(params: Unit): Flowable<List<TeamStandings>> {
        return standingsRepositoryImpl.standingsItem()
    }
}