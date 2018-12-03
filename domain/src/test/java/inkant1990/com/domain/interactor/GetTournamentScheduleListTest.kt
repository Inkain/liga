package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.schedule.tournamentSchedule.Competitors
import inkant1990.com.domain.entity.schedule.tournamentSchedule.Round
import inkant1990.com.domain.executor.PostExecutorThreadTest
import inkant1990.com.domain.repository.TournamentScheduleRepositoryImpl
import io.reactivex.Flowable
import io.reactivex.schedulers.TestScheduler
import io.reactivex.subscribers.TestSubscriber
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GetTournamentScheduleListTest {
    @Mock
    private lateinit var repository: TournamentScheduleRepositoryImpl

    private lateinit var useCase: GetTournamentScheduleList

    private lateinit var testScheduler: TestScheduler


    @Before
    fun setUP() {
        MockitoAnnotations.initMocks(this)

        testScheduler = TestScheduler()

        useCase = GetTournamentScheduleList(repository, PostExecutorThreadTest(testScheduler))
    }

    @Test
    fun testValidData() {
        val list = mutableListOf<Round>()
        list.add(
            Round(
                "1",
                mutableListOf<Competitors>(
                    Competitors(
                        "RealMAdrid",
                        "212",
                        "Barselona",
                        "1231",
                        "21:22",
                        "Santiago",
                        60000,
                        "Madrid"
                    )
                )
            )
        )
        list.add(
            Round(
                "1",
                mutableListOf<Competitors>(
                    Competitors(
                        "Villareal",
                        "21122",
                        "Levante",
                        "12331",
                        "21:22",
                        "Los Noches",
                        20000,
                        "Spain"
                    )
                )
            )
        )
        Mockito.`when`(repository.getTournamentSchedule()).thenReturn(Flowable.just(list))
        val subscriber: TestSubscriber<List<Round>> = TestSubscriber.create()

        useCase.scheduleRepositoryImpl.getTournamentSchedule().subscribe(subscriber)
        testScheduler.triggerActions()
        subscriber.assertValueCount(1)
        subscriber.assertSubscribed()
        subscriber.assertValue(list)
        subscriber.dispose()


    }
}