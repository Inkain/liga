package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.standings.TeamStandings
import inkant1990.com.domain.executor.PostExecutorThreadTest
import inkant1990.com.domain.repository.StandingsRepositoryImpl
import io.reactivex.Flowable
import io.reactivex.schedulers.TestScheduler
import io.reactivex.subscribers.TestSubscriber
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.runners.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class GetStandingsListTest {
    @Mock
    private lateinit var repository: StandingsRepositoryImpl

    private lateinit var useCase: GetStandingsList

    private lateinit var testScheduler: TestScheduler


    @Before
    fun setUP() {
        MockitoAnnotations.initMocks(this)

        testScheduler = TestScheduler()

        useCase = GetStandingsList(repository, PostExecutorThreadTest(testScheduler))
    }

    @Test
    fun testValidData() {
        val list = mutableListOf<TeamStandings>()
        list.add(TeamStandings(2, 13, 1, 1, 2, 10, 6, 7, 6, 20, "Milan", "2124"))
        list.add(TeamStandings(2, 13, 1, 2, 3, 10, 5, 7, 6, 18, "Barcelona", "2324"))
        `when`(repository.standingsItem()).thenReturn(Flowable.just(list))
        val subscriber: TestSubscriber<List<TeamStandings>> = TestSubscriber.create()

        useCase.standingsRepositoryImpl.standingsItem().subscribe(subscriber)
        testScheduler.triggerActions()
        subscriber.assertValueCount(1)
        subscriber.assertSubscribed()
        subscriber.assertValue(list)
        subscriber.dispose();


    }
}

