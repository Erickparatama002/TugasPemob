package com.example.latttt.network

import com.example.latttt.Model.Response
import com.example.latttt.Model.ResponseItem
import com.example.latttt.Model.ResponseMhs
import com.example.latttt.Model.ResponseMhsItem
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

class NetworkConfig {
// set interceptor
    fun getInterceptor() : OkHttpClient {
    val logging = HttpLoggingInterceptor()
    logging.level = HttpLoggingInterceptor.Level.BODY
    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(logging)
        .build()
    return  okHttpClient
    }
    fun getRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://kpsi.fti.ukdw.ac.id")
            .client(getInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    fun getService() = getRetrofit().create(Users::class.java)
}
interface Users {
    @POST("api/progmob/mhs/create")
    fun addMhs(@Body req : ResponseMhsItem): Call<ResponseMhs>
    @GET("api/progmob/mhs/{nim_progmob}")
    fun getUsers(): Call<List<ResponseItem>>
}

