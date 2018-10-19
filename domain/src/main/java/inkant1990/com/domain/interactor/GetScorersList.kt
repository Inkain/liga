package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.rankings.TopScorers
import inkant1990.com.domain.repository.PlayerRankinsRepository
import javax.inject.Inject

class GetScorersList @Inject constructor(val playerRankinsRepository: PlayerRankinsRepository) :
    UseCase<MutableCollection<TopScorers>, Unit>() {
    override fun buildUseCaseObservable(params: Unit) = playerRankinsRepository.getScorers()
}