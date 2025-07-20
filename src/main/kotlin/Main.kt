
fun main() {
    println("Setup successful!")
    println("Welcome to the Task Manager!")
    println("Here are your tasks:")
    println()

    val tasks = mutableListOf(
        Task("Play a Football match",    isDone = true),
        Task("Watch a movie",      isDone = false),
        Task("Buy groceries",        isDone = false)
    )

    tasks.forEach { task ->
        val statusIcon = if (task.isDone) "✅" else "❌"
        println("$statusIcon ${task.title}")
    }
}
data class Task(val title: String, var isDone: Boolean)
