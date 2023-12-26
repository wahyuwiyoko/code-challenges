/**
 * Concatenate two String:
 * - Cannot use the `fun` keyword.
 * - Cannot contain the `{` and `}` character.
 */
val concatString: (String, String) -> String = String::plus

fun main() {
    println(concatString("Kotlin", "Language") == "KotlinLanguage")
    println(concatString("John", "Doe") == "JohnDoe")
    println(concatString("Back ", "End") == "Back End")
}