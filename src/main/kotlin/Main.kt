import com.github.ivan_osipov.clabo.dsl.bot

fun main(args: Array<String>) {
    bot("api-key") longPooling  {
        onStart { command ->
            command.message answer "Hi, ${command.message.from}"
        }
        onHelp { command ->
            command.message answer "Test help answer"

        }

    }
}