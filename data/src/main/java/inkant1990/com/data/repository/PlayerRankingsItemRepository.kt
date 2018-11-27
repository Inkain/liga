package inkant1990.com.data.repository


import inkant1990.com.data.db.dao.RankingsDao
import inkant1990.com.data.db.entity.DataEntity
import inkant1990.com.data.entity.mapper.*
import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.repository.datasource.cloud.CloudPlayerRankingsStore
import inkant1990.com.domain.entity.rankings.Rankings
import inkant1990.com.domain.repository.PlayerRankingsRepositoryImpl
import io.reactivex.Flowable
import javax.inject.Inject


class PlayerRankingsItemRepository @Inject constructor(
    val cloud: CloudPlayerRankingsStore,
    val rankingsDao: RankingsDao,
    val utils: Utils
) : PlayerRankingsRepositoryImpl {
    companion object {
        const val TIME_BUFER = 50000
        private var lastTimeUpdate = 0L
    }

    override fun getScorers(): Flowable<List<Rankings>> {
        return rankingsDao.getScores()
            .flatMap { dbList ->
                if (checkDb(dbList)) {
                    cloud.getData()
                        .doOnNext {
                            dbOperation(it)
                        }
                        .map {
                            it.transformScoreToDomain()
                        }
                        .onErrorReturn {
                            if (dbList.isEmpty()) {

                                throw it;
                            } else {
                                dbList.map { it.transform() }
                            }
                        }
                } else {
                    Flowable.just(dbList).map {
                        it.map {
                            it.transform()
                        }
                    }
                }
            }
    }


    override fun getAssists(): Flowable<List<Rankings>> {
        return rankingsDao.getAssists()
            .flatMap { dbList ->
                if (checkDb(dbList)) {
                    cloud.getData()
                        .doOnNext {
                            dbOperation(it)
                        }
                        .map { it.transformAssistsToDomain() }
                        .onErrorReturn {
                            if (dbList.isEmpty()) {

                                throw it;
                            } else {
                                dbList.map { it.transform() }
                            }
                        }
                } else {
                    Flowable.just(dbList).map {
                        it.map {
                            it.transform()
                        }
                    }
                }
            }
    }


    private fun dbOperation(response: RankingsResponse) {
        rankingsDao.deleteAssists()
        rankingsDao.deleteScores()
        rankingsDao.deleteCards()
        rankingsDao.insertCards(response.transformCardsToDB())
        rankingsDao.insertAssists(response.transformAssistsToDb())
        rankingsDao.insertScores(response.transformScoreToDb())
        lastTimeUpdate = utils.getTime()
    }

    private fun checkDb(dbList: List<DataEntity>): Boolean {
        return (dbList.isEmpty() || utils.getTime() - lastTimeUpdate > PlayerRankingsItemRepository.TIME_BUFER) && utils.getCoonect()

    }

    override fun getReds(): Flowable<List<Rankings>> {
        return rankingsDao.getReds()
            .flatMap { dbList ->
                if (checkDb(dbList)) {
                    cloud.getData()
                        .doOnNext {
                            dbOperation(it)
                        }
                        .map { it.transformRedsToDomain() }
                        .onErrorReturn {
                            if (dbList.isEmpty()) {

                                throw it;
                            } else {
                                dbList.map { it.transformReds() }
                            }
                        }
                } else {
                    Flowable.just(dbList).map {
                        it.map {
                            it.transformReds()
                        }
                    }
                }
            }
    }

    override fun getYellows(): Flowable<List<Rankings>> {
        return rankingsDao.getYellows()
            .flatMap { dbList ->
                if (checkDb(dbList)) {
                    cloud.getData()
                        .doOnNext {
                            dbOperation(it)
                        }
                        .map { it.transformYellowsToDomain() }
                        .onErrorReturn {
                            if (dbList.isEmpty()) {

                                throw it;
                            } else {
                                dbList.map { it.transformYellow() }
                            }
                        }
                } else {
                    Flowable.just(dbList).map {
                        it.map {
                            it.transformYellow()
                        }
                    }
                }
            }
    }
}

