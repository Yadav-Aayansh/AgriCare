package com.agricare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.platform.CompositionLocalProvider
import com.agricare.ui.LanguageSelectionScreen
import com.agricare.ui.HomeScreen
import com.agricare.utils.setLocale

class MainActivity : ComponentActivity() {
    private var selectedLanguage = "en"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var showHome by remember { mutableStateOf(false) }

            if (showHome) {
                CompositionLocalProvider(LocalContext provides setLocale(this, selectedLanguage)) {
                    HomeScreen()
                }
            } else {
                LanguageSelectionScreen { lang ->
                    selectedLanguage = lang
                    showHome = true
                }
            }
        }
    }
}
