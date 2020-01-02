package consolecanvas.editor.commands

import consolecanvas.common.DefaultRuntime
import consolecanvas.common.Runtime

/**
 * The command terminates application
 */
class QuitCommand(val runtime: Runtime = DefaultRuntime) : Command {

    override fun execute() {
        runtime.exit(0)
    }
}
