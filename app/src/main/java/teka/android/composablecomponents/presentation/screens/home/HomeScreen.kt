package teka.android.composablecomponents.presentation.screens.home

import PrimaryButton
import SecondaryButton
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import teka.android.composablecomponents.presentation.components.BaseTextField



@Composable
fun HomeScreen() {
    Column {
        PrimaryButton(onClick = { /* do something */ })
        Spacer(Modifier.height(16.dp))
        SecondaryButton(onClick = { /* do something */ })
    }
}