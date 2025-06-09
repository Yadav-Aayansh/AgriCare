package com.agricare.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.agricare.R

@Composable
fun LanguageSelectionScreen(onLanguageSelected: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.select_language),
            style = MaterialTheme.typography.h5,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        Button(onClick = {
            onLanguageSelected("en")
        }, modifier = Modifier.padding(8.dp)) {
            Text(text = stringResource(id = R.string.english))
        }

        Button(onClick = {
            onLanguageSelected("hi")
        }, modifier = Modifier.padding(8.dp)) {
            Text(text = stringResource(id = R.string.hindi))
        }
    }
}
