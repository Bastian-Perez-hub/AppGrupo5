package com.example.appgrupo5.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.appgrupo5.data.model.Post
import com.example.appgrupo5.repository.PostRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// Mantiene el estado de los datos obtenidos
class PostViewModel : ViewModel() {

    private val repository = PostRepository()

    // Flujo mutable con la lista de posts (solo el ViewModel lo modifica)
    private val _postList = MutableStateFlow<List<Post>>(emptyList())

    // Flujo público de solo lectura para la pantalla
    val postList: StateFlow<List<Post>> = _postList

    // Se llama automáticamente al crear el ViewModel
    init {
        fetchPosts()
    }

    // Obtiene los datos en segundo plano
    private fun fetchPosts() {
        viewModelScope.launch {
            try {
                _postList.value = repository.getPosts()
            } catch (e: Exception) {
                println("Error al obtener datos: ${e.localizedMessage}")
            }
        }
    }
}