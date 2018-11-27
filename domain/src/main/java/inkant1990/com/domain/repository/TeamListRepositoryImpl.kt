package inkant1990.com.domain.repository

import inkant1990.com.domain.entity.Team
import io.reactivex.Flowable

interface TeamListRepositoryImpl {
    fun getTeamList(): Flowable<List<Team>>
}