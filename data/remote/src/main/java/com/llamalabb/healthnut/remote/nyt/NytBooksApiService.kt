package com.llamalabb.healthnut.remote.nyt

import com.llamalabb.healthnut.data.base.NetworkResponse
import com.llamalabb.healthnut.models.api.nyt.NytError
import com.llamalabb.healthnut.models.api.nyt.books.NytBook
import retrofit2.http.GET

interface NytBooksApiService {
    @GET("books")
    suspend fun getBooks(): NetworkResponse<NytBook, NytError>
}