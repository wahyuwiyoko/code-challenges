/**
 * The function takes String with character length from 1 to 100.
 *
 * The function return a middle characters from a String:
 * - If the String length is even, it returns 2 characters.
 * - If the String length is odd, it returns 1 character.
 */
fun getMiddleCharacters(string: String): String {
    val isStrInRange = string.length in 1.rangeTo(100)

    if (!isStrInRange) return ""

    val slicedStrLength = (string.length - 1) / 2
    val isEven = string.length % 2 == 0
    val middleChar = { index: Int -> string.substring(slicedStrLength, slicedStrLength + index) }

    return if (isEven) middleChar(2) else middleChar(1)
}

fun main() {
    println(getMiddleCharacters("multiply") == "ti")
    println(getMiddleCharacters("awesome") == "s")
    println(getMiddleCharacters("characters") == "ac")
    println(getMiddleCharacters("A") == "A")
}