package inkant1990.com.data.net


import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


class ApiModule {
    companion object {
        fun api(): LeagueApi {
            val retrofit = Retrofit.Builder()
                .client(OkHttpClient())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("https://api.sportradar.us/soccer-t3/eu/en/")
                .build()
            return retrofit.create(LeagueApi::class.java)
        }
    }

}

