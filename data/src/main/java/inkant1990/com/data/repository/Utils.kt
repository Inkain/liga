package inkant1990.com.data.repository

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import inkant1990.com.data.entity.playerRankings.RankingsResponse
import inkant1990.com.data.entity.playerRankings.TopCardsItem
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class  Utils@Inject constructor( val context: Context) {
    fun getTime():Long{
        return System.currentTimeMillis()
    }

    fun getCoonect():Boolean{
        val connect =context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return (connect.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED
                || connect.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED)
    }

}