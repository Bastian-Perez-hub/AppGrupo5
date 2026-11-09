package com.example.appgrupo5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.appgrupo5.ui.screens.PostScreen
import com.example.appgrupo5.ui.theme.AppGrupo5Theme
import com.example.appgrupo5.viewmodel.PostViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Permite dibujar bajo las barras del sistema

        setContent {
            AppGrupo5Theme {
                // Obtenemos el ViewModel
                val postViewModel: PostViewModel = viewModel()

                // Mostramos la pantalla principal
                PostScreen(viewModel = postViewModel)
            }
        }
    }
}