package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.standings.TeamStandings
import inkant1990.com.domain.repository.StandingsRepository
import io.reactivex.Flowable
import io.reactivex.Observable
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton


class GetStandingsList @Inject constructor(val standingsRepository: StandingsRepository) :
    UseCase<List<TeamStandings>, Unit>() {

    override fun buildUseCaseObservable(params: Unit): Flowable<List<TeamStandings>> {
        return standingsRepository.standingsItem()
    }
}