
package com.example.assignment.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ProfileScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        ProfileHeader()
        ProfileButtons()
        HighlightSection()
        PostGrid()
    }
}
