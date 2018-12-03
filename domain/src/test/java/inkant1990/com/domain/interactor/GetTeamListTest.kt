package inkant1990.com.domain.interactor

import inkant1990.com.domain.entity.Team
import inkant1990.com.domain.executor.PostExecutorThreadTest
import inkant1990.com.domain.repository.TeamListRepositoryImpl
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
class GetTeamListTest {
    @Mock
    private lateinit var repository: TeamListRepositoryImpl

    private lateinit var useCase: GetTeamList

    private lateinit var testScheduler: TestScheduler


    @Before
    fun setUP() {
        MockitoAnnotations.initMocks(this)

        testScheduler = TestScheduler()

        useCase = GetTeamList(repository, PostExecutorThreadTest(testScheduler))
    }

    @Test
    fun testValidData() {
        val list = mutableListOf<Team>()
        list.add(Team( "RealMAdrid", "2133"))
        list.add(Team( "Barselona", "2123"))
        Mockito.`when`(repository.getTeamList()).thenReturn(Flowable.just(list))
        val subscriber: TestSubscriber<List<Team>> = TestSubscriber.create()

        useCase.repositoryImpl.getTeamList().subscribe(subscriber)
        testScheduler.triggerActions()
        subscriber.assertValueCount(1)
        subscriber.assertSubscribed()
        subscriber.assertValue(list)
        subscriber.dispose()


    }
}