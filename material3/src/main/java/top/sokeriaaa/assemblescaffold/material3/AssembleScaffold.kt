package top.sokeriaaa.assemblescaffold.material3

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import top.sokeriaaa.assemblescaffold.material3.topbar.TopAppBar

/**
 * Assemble material 3 scaffold
 * @author Sokeriaaa
 * @date 2023/1/23
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssembleScaffold(
    modifier: Modifier = Modifier,
    topAppBar: TopAppBar? = null,
    content: @Composable (paddingValues: PaddingValues) -> Unit
) {
    Scaffold(
        modifier = modifier,
        topBar = {
            topAppBar?.Compose()
        },
        content = content
    )
}