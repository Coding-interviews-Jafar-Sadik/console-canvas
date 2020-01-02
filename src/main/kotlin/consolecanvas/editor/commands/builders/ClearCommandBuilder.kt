package consolecanvas.editor.commands.builders

import consolecanvas.editor.EditorContext
import consolecanvas.editor.commands.ClearCommand

/**
 * Builds commands of type ClearCommand
 * syntax: C
 */
object ClearCommandBuilder : CommandBuilder("""C""") {

    override fun build(editorContext: EditorContext, regexGroups: List<String>) = ClearCommand(editorContext.activeCanvas)
}
