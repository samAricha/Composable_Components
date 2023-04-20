package teka.android.composablecomponents.presentation.screens.home

import PrimaryButton
import SecondaryButton
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import teka.android.composablecomponents.presentation.components.BaseTextField
import teka.android.composablecomponents.ui.theme.utils.elevation
import teka.android.composablecomponents.ui.theme.utils.spacing


@Composable
fun HomeScreen() {
    Column {
        PrimaryButton(onClick = { /* do something */ })
        Spacer(Modifier.height(
            MaterialTheme.spacing.medium
        ))
        SecondaryButton(onClick = { /* do something */ })

        Spacer(Modifier.height(
            MaterialTheme.spacing.medium
        ))

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .shadow(
                    elevation = MaterialTheme.elevation.medium
                ) // Set the elevation using LocalElevation
                .padding(MaterialTheme.spacing.medium)
        ) {
            Text("My Test Button")
        }
    }
}