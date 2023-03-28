package com.example.midterm.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun PersonComposable(
    firstName: String,
    lastName: String,
    email: String,
    nationality: String,
) {
    Card(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        backgroundColor = Color(240, 240, 240),
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Row {
                Text("$firstName $lastName", modifier = Modifier.fillMaxWidth(0.8f))
                Text(nationality)
            }
            Text(email)
        }
    }
}
