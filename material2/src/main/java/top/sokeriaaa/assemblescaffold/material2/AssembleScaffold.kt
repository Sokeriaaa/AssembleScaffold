package top.sokeriaaa.assemblescaffold.material2

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import top.sokeriaaa.assemblescaffold.material2.topbar.TopAppBar

/**
 * Assemble material 2 scaffold
 * @author Sokeriaaa
 * @date 2023/1/23
 */
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