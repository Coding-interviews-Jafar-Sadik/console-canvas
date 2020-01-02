package consolecanvas

import consolecanvas.editor.Editor
import consolecanvas.editor.EditorContext
import consolecanvas.editor.commands.CommandParser

fun main(args: Array<String>) {
    val editorContext = EditorContext()
    val commandParser = CommandParser(editorContext)
    val editor = Editor(editorContext, commandParser)

    editor.run()
}
