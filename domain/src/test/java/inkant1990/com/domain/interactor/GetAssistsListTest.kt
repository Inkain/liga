package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.rankings.Rankings
import inkant1990.com.domain.executor.PostExecutorThreadTest
import inkant1990.com.domain.repository.PlayerRankingsRepositoryImpl
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
class GetAssistsListTest {
    @Mock
    private lateinit var repository: PlayerRankingsRepositoryImpl

    private lateinit var useCase: GetAssistsList

    private lateinit var testScheduler: TestScheduler


    @Before
    fun setUP() {
        MockitoAnnotations.initMocks(this)

        testScheduler = TestScheduler()

        useCase = GetAssistsList(repository, PostExecutorThreadTest(testScheduler))
    }

    @Test
    fun testValidData() {
        val list = mutableListOf<Rankings>()
        list.add(Rankings(10, "RealMAdrid", "2133", "Isco", "1111"))
        list.add(Rankings(1, "Barselona", "2123", "Messi", "0001"))
        Mockito.`when`(repository.getAssists()).thenReturn(Flowable.just(list))
        val subscriber: TestSubscriber<List<Rankings>> = TestSubscriber.create()

        useCase.playerRankinsRepository.getAssists().subscribe(subscriber)
        testScheduler.triggerActions()
        subscriber.assertValueCount(1)
        subscriber.assertSubscribed()
        subscriber.assertValue(list)
        subscriber.dispose();
    }
}