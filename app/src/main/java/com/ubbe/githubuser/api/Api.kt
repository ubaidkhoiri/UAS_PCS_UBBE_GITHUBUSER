package com.ubbe.githubuser.api

import com.ubbe.githubuser.data.model.DetailUserResponse
import com.ubbe.githubuser.data.model.User
import com.ubbe.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query


interface Api {
    @GET("search/users")
    @Headers("Authorization: token 4e9ddd8c4b0d6d3378b882fd9f9c8aebf8dc60f9")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 4e9ddd8c4b0d6d3378b882fd9f9c8aebf8dc60f9")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 4e9ddd8c4b0d6d3378b882fd9f9c8aebf8dc60f9")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 4e9ddd8c4b0d6d3378b882fd9f9c8aebf8dc60f9")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}