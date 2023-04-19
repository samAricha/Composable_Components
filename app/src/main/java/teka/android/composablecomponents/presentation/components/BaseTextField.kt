package teka.android.composablecomponents.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun BaseTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    icon: @Composable (() -> Unit)? = null,
    modifier: Modifier = Modifier,
) {
    Row(modifier = modifier) {
        if (icon != null) {
            icon()
            Spacer(modifier = Modifier.width(8.dp))
        }
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            label = { Text(text = label) },
            singleLine = true,
            modifier = Modifier.weight(1f)
        )
    }
}