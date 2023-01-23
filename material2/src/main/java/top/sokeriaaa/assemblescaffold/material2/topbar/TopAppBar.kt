package top.sokeriaaa.assemblescaffold.material2.topbar

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import top.sokeriaaa.assemblescaffold.material2.icon.ActionIconButton
import androidx.compose.material.TopAppBar as ComposeTopAppBar

/**
 * Material 2 top app bars
 * @author Sokeriaaa
 * @date 2023/1/23
 */
sealed class TopAppBar(
    val title: String,
    val navigationIcon: ActionIconButton? = null,
    val actions: List<ActionIconButton>? = null
) {

    @Composable
    abstract fun Compose()

    class Default(
        title: String,
        navigationIcon: ActionIconButton? = null,
        actions: List<ActionIconButton>? = null
    ) : TopAppBar(
        title = title,
        navigationIcon = navigationIcon,
        actions = actions
    ) {
        @Composable
        override fun Compose() {
            ComposeTopAppBar(
                title = {
                    Text(title)
                },
                navigationIcon = {
                    navigationIcon?.Compose()
                },
                actions = {
                    actions?.forEach {
                        it.Compose()
                    }
                }
            )
        }
    }
}
