package consolecanvas.editor.commands.builders

import consolecanvas.editor.EditorContext
import consolecanvas.editor.commands.UndoCommand

/**
 * Builds commands of type UndoCommand
 * syntax: U
 */
object UndoCommandBuilder : CommandBuilder("""U""") {

    override fun build(editorContext: EditorContext, regexGroups: List<String>) = UndoCommand(editorContext)
}
