package inkant1990gmail.com.laliga.base

import android.arch.lifecycle.ViewModel

abstract class BaseViewModel<R:BaseRouter<*>> : ViewModel() {
    protected var router:R?=null


    fun addRouter(router:R){
        this.router=router
    }
    fun removeRouter(){
        this.router=null
    }

    override  fun onCleared() {
        super.onCleared()

    }



}