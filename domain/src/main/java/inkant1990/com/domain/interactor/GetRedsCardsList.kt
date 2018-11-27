package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.rankings.Rankings
import inkant1990.com.domain.executor.PostExecutorThread
import inkant1990.com.domain.repository.PlayerRankingsRepositoryImpl
import javax.inject.Inject

class GetRedsCardsList @Inject constructor(
    val playerRankinsRepository: PlayerRankingsRepositoryImpl,
    postExecutorThread: PostExecutorThread
) :
    UseCase<List<Rankings>, Unit>(postExecutorThread) {
    override fun buildUseCaseObservable(params: Unit) = playerRankinsRepository.getReds()
}
