package top.sokeriaaa.assemblescaffold.material2.icon

import androidx.compose.material.Icon
import androidx.compose.material.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Material 2 icon
 * @author Sokeriaaa
 * @date 2023/1/23
 */
sealed class ActionIcon {

    @Composable
    abstract fun Compose()

    internal class PainterActionIcon(
        val painter: Painter,
        val contentDescription: String?,
        val tint: Color? = null
    ) : ActionIcon() {
        @Composable
        override fun Compose() {
            Icon(
                painter = painter,
                contentDescription = contentDescription,
                tint = tint ?: LocalContentColor.current
            )
        }
    }

    internal class ImageVectorActionIcon(
        val imageVector: ImageVector,
        val contentDescription: String?,
        val tint: Color? = null
    ) : ActionIcon() {
        @Composable
        override fun Compose() {
            Icon(
                imageVector = imageVector,
                contentDescription = contentDescription,
                tint = tint ?: LocalContentColor.current
            )
        }
    }

    internal class ImageBitmapActionIcon(
        val bitmap: ImageBitmap,
        val contentDescription: String?,
        val tint: Color? = null
    ) : ActionIcon() {
        @Composable
        override fun Compose() {
            Icon(
                bitmap = bitmap,
                contentDescription = contentDescription,
                tint = tint ?: LocalContentColor.current
            )
        }
    }
}

fun ActionIcon(
    painter: Painter,
    contentDescription: String?,
    tint: Color? = null
): ActionIcon {
    return ActionIcon.PainterActionIcon(
        painter = painter,
        contentDescription = contentDescription,
        tint = tint,
    )
}

fun ActionIcon(
    imageVector: ImageVector,
    contentDescription: String?,
    tint: Color? = null
): ActionIcon {
    return ActionIcon.ImageVectorActionIcon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = tint,
    )
}

fun ActionIcon(
    bitmap: ImageBitmap,
    contentDescription: String?,
    tint: Color? = null
): ActionIcon {
    return ActionIcon.ImageBitmapActionIcon(
        bitmap = bitmap,
        contentDescription = contentDescription,
        tint = tint,
    )
}