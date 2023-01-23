package top.sokeriaaa.assemblescaffold.material2.icon

import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable

/**
 * Material 3 action icons
 * @author Sokeriaaa
 * @date 2023/1/23
 */
class ActionIconButton(
    val actionIcon: ActionIcon,
    val onClick: () -> Unit = {}
) {

    @Composable
    fun Compose() {
        IconButton(
            onClick = onClick
        ) {
            actionIcon.Compose()
        }
    }

}

fun ActionIcon.toActionIconButton(
    onClick: () -> Unit = {}
): ActionIconButton {
    return ActionIconButton(
        actionIcon = this,
        onClick = onClick
    )
}
