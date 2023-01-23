package top.sokeriaaa.assemblescaffold.material3.topbar

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import top.sokeriaaa.assemblescaffold.material3.icon.ActionIconButton
import androidx.compose.material3.TopAppBar as ComposeTopAppBar

/**
 * Material 3 top app bars
 * @author Sokeriaaa
 * @date 2023/1/23
 */
@OptIn(ExperimentalMaterial3Api::class)
sealed class TopAppBar(
    val title: String,
    val navigationIcon: ActionIconButton? = null,
    val actions: List<ActionIconButton>? = null
) {

    @Composable
    abstract fun Compose()

    class Small(
        title: String,
        navigationIcon: ActionIconButton? = null,
        actions: List<ActionIconButton>? = null,
        private val scrollBehavior: TopAppBarScrollBehavior? = null
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
                },
                scrollBehavior = scrollBehavior
            )
        }
    }

    class Medium(
        title: String,
        navigationIcon: ActionIconButton? = null,
        actions: List<ActionIconButton>? = null,
        private val scrollBehavior: TopAppBarScrollBehavior? = null
    ) : TopAppBar(
        title = title,
        navigationIcon = navigationIcon,
        actions = actions
    ) {
        @Composable
        override fun Compose() {
            MediumTopAppBar(
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
                },
                scrollBehavior = scrollBehavior
            )
        }
    }

    class Large(
        title: String,
        navigationIcon: ActionIconButton? = null,
        actions: List<ActionIconButton>? = null,
        private val scrollBehavior: TopAppBarScrollBehavior? = null
    ) : TopAppBar(
        title = title,
        navigationIcon = navigationIcon,
        actions = actions
    ) {
        @Composable
        override fun Compose() {
            LargeTopAppBar(
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
                },
                scrollBehavior = scrollBehavior
            )
        }
    }

    class CenterAligned(
        title: String,
        navigationIcon: ActionIconButton? = null,
        actions: List<ActionIconButton>? = null,
        private val scrollBehavior: TopAppBarScrollBehavior? = null
    ) : TopAppBar(
        title = title,
        navigationIcon = navigationIcon,
        actions = actions
    ) {
        @Composable
        override fun Compose() {
            CenterAlignedTopAppBar(
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
                },
                scrollBehavior = scrollBehavior
            )
        }
    }
}
