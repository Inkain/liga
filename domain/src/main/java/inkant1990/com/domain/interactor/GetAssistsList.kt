package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.Entity
import inkant1990.com.domain.entity.rankings.TopAssists
import inkant1990.com.domain.repository.PlayerRankinsRepository
import javax.inject.Inject

class GetAssistsList @Inject constructor(val playerRankinsRepository: PlayerRankinsRepository) :
    UseCase<List<TopAssists>, Unit>() {
    override fun buildUseCaseObservable(params: Unit) = playerRankinsRepository.getAssists()
}