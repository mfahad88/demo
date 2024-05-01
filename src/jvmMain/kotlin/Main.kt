import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.clickable
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.*
import compose.SideBar

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    var selectedOption by remember {
        mutableStateOf("")
    }
    MaterialTheme {
        Scaffold (
            topBar = {
                TopAppBar {
                    Text("ABC pharmacy")
                }
            },
            content = {
                SideBar(){
                    print(it)
                }
            }
        )
    }
}

fun main() = application {
    val windowState = rememberWindowState(WindowPlacement.Maximized)
    Window(onCloseRequest = ::exitApplication, state = windowState) {
        App()
    }
}
