package consolecanvas.editor.commands

import consolecanvas.canvas.Canvas2D
import consolecanvas.editor.EditorContext

/**
 * The command creates a new canvas of a given size.
 */
data class NewCommand(val editorContext: EditorContext, val width: Int, val height: Int) : Command {

    override fun execute() {
        editorContext.activeCanvas = Canvas2D(width, height)
    }
}
