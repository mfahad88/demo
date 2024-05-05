package compose

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun LabelTextField(label:String="Customer Name: ",value:String="",keyboardType: KeyboardType, onValueChange: (String) -> Unit){
    Row {
        Text(label, modifier = Modifier.align(Alignment.Bottom))
        OutlinedTextField(value = value, singleLine = true ,onValueChange ={
            onValueChange(it)
        }, keyboardOptions = KeyboardOptions(keyboardType = keyboardType), modifier = Modifier.height(50.dp))
    }
}
