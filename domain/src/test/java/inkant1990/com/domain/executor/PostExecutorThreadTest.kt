package inkant1990.com.domain.executor

import io.reactivex.Scheduler

class PostExecutorThreadTest(private  var testScheduler: Scheduler) : PostExecutorThread {
    override fun getScheduler(): Scheduler {
        return testScheduler;
    }
}