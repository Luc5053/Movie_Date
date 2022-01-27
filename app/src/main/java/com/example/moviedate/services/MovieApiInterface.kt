package com.example.moviedate.services

import com.example.moviedate.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/movie/top_rated?api_key=df8f73aa027c3d29700e40b062c1a295")
    fun getMovieList(): Call<MovieResponse>
}