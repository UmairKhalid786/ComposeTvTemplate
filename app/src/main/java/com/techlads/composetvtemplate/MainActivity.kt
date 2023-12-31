package com.techlads.composetvtemplate

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.tv.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.tv.material3.MaterialTheme
import com.techlads.composetvtemplate.ui.theme.ComposeTvTemplateTheme
import kotlinx.coroutines.delay

class MainActivity : androidx.activity.ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTvTemplateTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        HelloComposeTv()
    }
}

@Composable
fun HelloComposeTv() {
    var show by remember { mutableStateOf(false) }
    LaunchedEffect(key1 = Unit) {
        delay(2000)
        show = true
    }
    AnimatedVisibility(visible = show) {
        Text(text = "Hello Compose TV!", style = MaterialTheme.typography.headlineLarge)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeTvTemplateTheme {
        HelloComposeTv()
    }
}