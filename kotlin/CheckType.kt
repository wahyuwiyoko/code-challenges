fun <T> checkType(args: T): String {
    val result = { type: String -> "Yes! it's $type" }

    return when (args) {
        is Int -> result("Integer")
        is String -> result("String")
        is Boolean -> result("Boolean")
        is Double -> result("Double")
        is List<*> -> result("List")
        is Map<*, *> -> result("Map")
        else -> "Unknown type!"
    }
}

fun main() {
    println(
        """
        '50' is Int? ${checkType(50)}
        'John Doe' is String? ${checkType("John Doe")}
        'true' is Boolean? ${checkType(true)}
        '10.01' is Double? ${checkType(10.01)}
        '[10, 9, 8, 7, 6]' is List? ${checkType(listOf(10, 9, 8, 7, 6))}        
        'key: value' is Map? ${checkType(mapOf("key" to "value"))}
        """.trimIndent()
    )
}