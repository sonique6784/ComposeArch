package fr.sonique.composearch.ui.common

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun MyScreenTitle(title: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 16.dp, bottom = 16.dp),
        textAlign = TextAlign.Center,
        style = MaterialTheme.typography.h3
    )
}