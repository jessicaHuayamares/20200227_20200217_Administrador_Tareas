package com.example.administradortareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.administradortareas.ui.theme.AdministradorTareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdministradorTareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(title = stringResource(R.string.title1), subtitle = stringResource(R.string.subtitle1))
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String,subtitle: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(modifier = modifier.fillMaxSize(),verticalArrangement = Arrangement.Center,horizontalAlignment = Alignment.CenterHorizontally ) {
        Image(
            painter = image,
            contentDescription = null
        )
        Text(
            text = title,
            fontWeight = Bold,
            modifier= Modifier.padding(top = 24.dp, bottom = 8.dp )

        )
        Text(
            text = subtitle,
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AdministradorTareasTheme {
        Greeting(title = stringResource(R.string.title1), subtitle = stringResource(R.string.subtitle1))
    }
}