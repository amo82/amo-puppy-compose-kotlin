package com.example.androiddevchallenge

import androidx.activity.OnBackPressedDispatcher
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.example.androiddevchallenge.utils.LocalBackDispatcher
import dev.chrisbanes.accompanist.insets.ProvideWindowInsets

@Composable
fun PuppyApp(backDispatcher: OnBackPressedDispatcher) {

    CompositionLocalProvider(LocalBackDispatcher provides backDispatcher) {
        ProvideWindowInsets {
            NavGraph()

        }
    }
}