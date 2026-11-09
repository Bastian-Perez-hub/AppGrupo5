package com.example.appgrupo5.data.remote

import com.example.appgrupo5.data.model.Post
import retrofit2.http.GET

// Define los endpoints HTTP
interface ApiService {

    // Solicitud GET al endpoint /posts
    @GET("/posts")
    suspend fun getPosts(): List<Post>
}