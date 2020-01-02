package consolecanvas.editor.commands.builders

import consolecanvas.canvas.Point
import consolecanvas.editor.EditorContext
import consolecanvas.editor.commands.Command
import consolecanvas.editor.commands.DrawLineCommand

/**
 * Builds commands of type DrawLineCommand
 * syntax: L x1 y1 x2 y2
 */
object DrawLineCommandBuilder : CommandBuilder("""L\s+(\d+)\s+(\d+)\s+(\d+)\s+(\d+)""") {

    override fun build(editorContext: EditorContext, regexGroups: List<String>): Command {
        val (_, x1, y1, x2, y2) = regexGroups
        val lineFrom = Point(x1.toInt(), y1.toInt())
        val lineTo = Point(x2.toInt(), y2.toInt())
        return DrawLineCommand(editorContext.activeCanvas, lineFrom, lineTo)
    }
}
