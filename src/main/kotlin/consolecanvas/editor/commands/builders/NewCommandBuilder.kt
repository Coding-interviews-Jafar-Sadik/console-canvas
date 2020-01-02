package consolecanvas.editor.commands.builders

import consolecanvas.editor.EditorContext
import consolecanvas.editor.commands.Command
import consolecanvas.editor.commands.NewCommand

/**
 * Builds commands of type NewCommand
 * syntax: C
 */
object NewCommandBuilder : CommandBuilder("""C\s+(\d+)\s+(\d+)""") {

    override fun build(editorContext: EditorContext, regexGroups: List<String>): Command {
        val (_, width, height) = regexGroups
        return NewCommand(editorContext, width.toInt(), height.toInt())
    }
}
