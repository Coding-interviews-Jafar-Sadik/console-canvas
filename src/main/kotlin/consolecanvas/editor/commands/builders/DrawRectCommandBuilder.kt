package consolecanvas.editor.commands.builders

import consolecanvas.canvas.Point
import consolecanvas.editor.EditorContext
import consolecanvas.editor.commands.Command
import consolecanvas.editor.commands.DrawRectangleCommand

/**
 * Builds commands of type DrawRectangleCommand
 * syntax: R x1 y1 x2 y2
 */
object DrawRectCommandBuilder : CommandBuilder("""R\s+(\d+)\s+(\d+)\s+(\d+)\s+(\d+)""") {

    override fun build(editorContext: EditorContext, regexGroups: List<String>): Command {
        val (_, x1, y1, x2, y2) = regexGroups
        val upperLeftCorner = Point(x1.toInt(), y1.toInt())
        val lowerRightCorner = Point(x2.toInt(), y2.toInt())
        return DrawRectangleCommand(editorContext.activeCanvas, upperLeftCorner, lowerRightCorner)
    }
}
