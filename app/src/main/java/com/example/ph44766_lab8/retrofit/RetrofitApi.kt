package com.example.ph44766_lab8.retrofit

import com.example.ph44766_lab8.model.MovieResponse
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitApi {
    @GET("/")
    suspend fun getListFilms(): Response<List<MovieResponse>>
}