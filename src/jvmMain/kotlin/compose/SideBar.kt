package compose

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun SideBar(onClick:(String)->Unit) {

    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(0.2f)
        .background(Color.DarkGray)
        .padding(top = 10.dp, start = 5.dp)){

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically){
            Column {
                MenuText("Dashboard") {
                    onClick(it)
                }
                MenuText("Sales"){
                    onClick(it)
                }
                MenuText("Inventory"){
                    onClick(it)
                }
                MenuText("Supplier"){
                    onClick(it)
                }
                MenuText("Customer"){
                    onClick(it)
                }
                MenuText("Return"){
                    onClick(it)
                }
                MenuText("Logout"){

                }
            }

        }

    }
}
