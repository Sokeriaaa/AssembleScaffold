package top.sokeriaaa.assembleexample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import top.sokeriaaa.assembleexample.ui.theme.AssembleScaffoldTheme
import top.sokeriaaa.assemblescaffold.material3.AssembleScaffold
import top.sokeriaaa.assemblescaffold.material3.icon.ActionIcon
import top.sokeriaaa.assemblescaffold.material3.icon.toActionIconButton
import top.sokeriaaa.assemblescaffold.material3.topbar.TopAppBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssembleScaffoldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AssembleScaffoldExample()
                }
            }
        }
    }
}

@Composable
fun AssembleScaffoldExample() {
    val context = LocalContext.current
    AssembleScaffold(
        modifier = Modifier.fillMaxSize(),
        topAppBar = TopAppBar.CenterAligned(
            title = "AssembleScaffold",
            navigationIcon = ActionIcon(
                imageVector = Icons.Default.Menu,
                contentDescription = "Menu"
            ).toActionIconButton {
                Toast.makeText(
                    context,
                    "Menu button clicked!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        )
    ) {
        Row(
            modifier = Modifier.padding(paddingValues = it)
        ) {
            Greeting("Android")
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AssembleScaffoldTheme {
        Greeting("Android")
    }
}