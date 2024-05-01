package compose

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun MenuText(value:String="Test",onClick:(String)->Unit){
    Text(value, style = TextStyle(
        fontSize = 16.sp,
        color = Color.White
    ), modifier = Modifier.padding(bottom = 10.dp).clickable {
        onClick(value)
    })
}
