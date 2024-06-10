package com.example.ph44766_lab8.retrofit

import com.example.ph44766_lab8.model.Phim
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class RetrofitService {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8000/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val movieService: RetrofitApi by lazy {
        retrofit.create(RetrofitApi::class.java)
    }

}