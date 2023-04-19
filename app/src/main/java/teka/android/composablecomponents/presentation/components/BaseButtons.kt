import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Done
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "Primary",
    icon: ImageVector? = Icons.Default.Done,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(48.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(24.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Yellow,
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(24.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        content = {
            if (icon != null) {
                Icon(
                    icon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(Modifier.width(8.dp))
            }
            Text(text)
        }
    )
}

@Composable
fun SecondaryButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String = "Secondary",
    icon: ImageVector? = Icons.Default.Clear,
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .height(48.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(24.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.White,
            contentColor = Color.Yellow,
            disabledContentColor = Color.Gray,
            disabledBackgroundColor = Color.LightGray
        ),
        shape = RoundedCornerShape(24.dp),
        border = BorderStroke(1.dp, Color.Yellow),
        contentPadding = PaddingValues(horizontal = 16.dp),
        enabled = true,
        content = {
            if (icon != null) {
                Icon(
                    icon,
                    contentDescription = null,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(Modifier.width(8.dp))
            }
            Text(text)
        }
    )
}

