package com.example.latttt

import com.example.latttt.Model.ResponseMhs
import com.example.latttt.Model.ResponseMhsItem
import com.example.latttt.network.NetworkConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PostApiService {
    fun addMhs(req: ResponseMhsItem, onResult: (ResponseMhs) -> Unit){
        val retrofit = NetworkConfig().getService()
        retrofit.addMhs(req).enqueue(
            object : Callback<ResponseMhs> {
                override fun onFailure(call: Call<ResponseMhs>, t: Throwable){
                }
                override fun onResponse(call: Call<ResponseMhs>, response: Response<ResponseMhs>){
                    val addedMhs = response.body()
                    if (addedMhs != null) {
                        onResult(addedMhs)
                    }
                }
            }
        )
    }
}