package com.example.appgrupo5.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Singleton con la configuración de Retrofit
object RetrofitInstance {

    // Se crea el servicio una sola vez (lazy)
    val api: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com") // URL base de la API
            .addConverterFactory(GsonConverterFactory.create()) // Convierte JSON a objetos
            .build()
            .create(ApiService::class.java) // Implementa la interfaz ApiService
    }
}