package com.project.tuk_talkunderstandknow.android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MenuView()
                }
            }
        }
    }
}

@Composable
fun MenuView(){
    var selectedItem by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = if (selectedItem == 0) Icons.Filled.Home else Icons.Outlined.Home, // Utilizza un'icona predefinita
                            contentDescription = "Home" // Descrizione per l'accessibilità
                        )
                    },
                    label = { Text("Prova") },
                    selected = selectedItem == 0,
                    onClick = {
                        selectedItem = 0
                    }
                )

                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.List, // Utilizza un'icona predefinita
                            contentDescription = "Home" // Descrizione per l'accessibilità
                        )
                    },
                    label = { Text("Prova") },
                    selected = selectedItem == 1,
                    onClick = {
                        selectedItem = 1
                    }
                )

                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.FavoriteBorder, // Utilizza un'icona predefinita
                            contentDescription = "Home" // Descrizione per l'accessibilità
                        )
                    },
                    label = { Text("Prova") },
                    selected = selectedItem == 2,
                    onClick = {
                        selectedItem = 2
                    }
                )

                NavigationBarItem(
                    icon = {
                        Icon(
                            imageVector = Icons.Outlined.AccountCircle, // Utilizza un'icona predefinita
                            contentDescription = "Home" // Descrizione per l'accessibilità
                        )
                    },
                    label = { Text("Prova") },
                    selected = selectedItem == 3,
                    onClick = {
                        selectedItem = 3
                    }
                )
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
        ) {
            Text(text = "PROVA")
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {

    }
}
