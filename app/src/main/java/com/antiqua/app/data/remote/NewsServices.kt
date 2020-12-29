package com.antiqua.app.data.remote

import com.antiqua.app.data.model.NewsList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsServices {
    @GET("/")
    fun listNews() : Call<NewsList>

    @GET("detail/")
    fun detailNews(@Query("url") url: String) : Call<NewsList>

    @GET("search/")
    fun searchNews(@Query("q") query: String) : Call<NewsList>
}