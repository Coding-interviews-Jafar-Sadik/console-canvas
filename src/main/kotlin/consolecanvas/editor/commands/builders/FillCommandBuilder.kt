package consolecanvas.editor.commands.builders

import consolecanvas.canvas.Point
import consolecanvas.editor.EditorContext
import consolecanvas.editor.commands.Command
import consolecanvas.editor.commands.FillCommand


/**
 * Builds commands of type FillCommand
 * syntax: B x y colour
 */
object FillCommandBuilder : CommandBuilder("""B\s+(\d+)\s+(\d+)\s+(\w)""") {

    override fun build(editorContext: EditorContext, regexGroups: List<String>): Command {
        val (_, x, y, colour) = regexGroups
        val startPoint = Point(x.toInt(), y.toInt())
        return FillCommand(editorContext.activeCanvas, startPoint, colour[0])
    }
}
