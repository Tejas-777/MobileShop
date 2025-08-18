package com.example.mobileshop.screens.home

import android.annotation.SuppressLint
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(){

    Scaffold(
        topBar = {MyTopAppBar()}
    ) {
        Text(text = "Demo")
    }
}