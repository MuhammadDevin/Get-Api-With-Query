package com.muhammaddevin.android.get_api_with_query.network

import com.muhammaddevin.android.get_api_with_query.data.Users
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun searchUser(
        @Query("q")
        username: String
    ) : Call<Users>
}