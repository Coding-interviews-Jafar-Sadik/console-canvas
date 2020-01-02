package consolecanvas.editor.commands.builders

import consolecanvas.editor.EditorContext
import consolecanvas.editor.commands.QuitCommand

/**
 * Builds commands of type QuitCommand
 * syntax: Q
 */
object QuitCommandBuilder : CommandBuilder("""Q""") {

    override fun build(editorContext: EditorContext, regexGroups: List<String>) = QuitCommand()
}
