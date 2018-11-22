package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.rankings.Rankings
import inkant1990.com.domain.repository.PlayerRankinsRepository
import javax.inject.Inject

class GetYellowCardsList@Inject constructor(val playerRankinsRepository: PlayerRankinsRepository) :
UseCase<List<Rankings>, Unit>() {
    override fun buildUseCaseObservable(params: Unit) = playerRankinsRepository.getYellows()
}
