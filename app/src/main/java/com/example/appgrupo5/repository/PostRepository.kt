package com.example.appgrupo5.repository

import com.example.appgrupo5.data.model.Post
import com.example.appgrupo5.data.remote.RetrofitInstance

// Se encarga de acceder a los datos usando Retrofit
class PostRepository {

    // Obtiene los posts desde la API
    suspend fun getPosts(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}