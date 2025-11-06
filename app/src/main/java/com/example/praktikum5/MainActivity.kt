package com.example.praktikum5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.ui.Modifier // Pastikan Modifier di-import
import com.example.praktikum5.ui.theme.Praktikum5Theme
// BENAR: Impor Composable 'DataApp' dari file Navigasi.kt Anda
import com.example.praktikum5.DataApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Praktikum5Theme {

                DataApp(modifier = Modifier)
            }
        }
    }
}