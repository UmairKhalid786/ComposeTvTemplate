@file:OptIn(ExperimentalTvMaterial3Api::class)

package com.techlads.composetvtemplate.ui

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.tv.foundation.lazy.list.TvLazyColumn
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.Icon
import androidx.tv.material3.MaterialTheme
import androidx.tv.material3.Text

@Composable
fun Menu() {
    TvLazyColumn(content = {
        item {
            MenuItem(title = "Play", ic = ImageVector.vectorResource(id = android.R.drawable.ic_media_play))
            MenuItem(title = "Play", ic = ImageVector.vectorResource(id = android.R.drawable.ic_media_play))
            MenuItem(title = "Play", ic = ImageVector.vectorResource(id = android.R.drawable.ic_media_play))
            MenuItem(title = "Play", ic = ImageVector.vectorResource(id = android.R.drawable.ic_media_play))
        }
    })
}

@Composable
fun MenuItem(title: String, ic: ImageVector ) {
    Row(Modifier.padding(16.dp)) {
        Icon(imageVector = ic, contentDescription = title)
        Text(text = title, style = MaterialTheme.typography.bodyLarge)
    }
}