package com.example.appmascota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appmascota.ui.theme.AppMascotaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppMascotaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2B48C)
                ) {
                    Elementos()
                }
            }
        }
    }
}

@Composable
fun Elementos() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.mascota),
            contentDescription = "Mascota"
        )
        Text("Mascota Feliz",
            color = Color(0xFF8B4513),
            fontSize = 45.sp
        )
        Text("")
        Text("Bienvenido, usuario")
        Text("")
        Row {
            OutlinedButton(onClick = { /* TODO */ }) {
                Text("Tu Mascota", color = Color.Black)
            }
            Spacer(modifier = Modifier.width(15.dp))
            OutlinedButton(onClick = { /* TODO */ }) {
                Text("Contenidos", color = Color.Black)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElementosPreview() {
    AppMascotaTheme {
        Elementos()
    }
}