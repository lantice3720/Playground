import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }
    MaterialTheme {
        Column {
            TopAppBar {
                // Navigators
                NavigationRail {
                    // NavigationRailItems
                    NavigationRailItem(
                        icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                        label = { Text("Home", maxLines = 1) },
                        selected = true,
                        onClick = { /*TODO*/ }
                    )
                }
            }
            Text(text)
            Button(onClick = { text = "Hello, Desktop!" }) {
                Text("Click me!")
            }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "Playground") {
        App()
    }
}
