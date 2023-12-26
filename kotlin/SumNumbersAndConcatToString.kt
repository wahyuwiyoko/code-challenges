/**
 * The function takes String and Integer with a range from 1 to 100.
 *
 * The function return a String with conditions:
 * - If the String contains a number, then multiply the number in the
 *   String with the inputted number. Then concatenate the String with the result
 *   of multiplying the numbers.
 * - If the String does not contains a number, then concatenate the String
 *   with the inputted number.
 */
fun sumNumbersAndConcatToString(string: String, number: Int): String {
    val isStrInRange = string.length in 1.rangeTo(100)
    val isIntInRange = number.toString().count { it.isDigit() } in 1.rangeTo(100)

    if (!(isStrInRange && isIntInRange)) return ""

    val getInt = string.filter { it.isDigit() }.toIntOrNull()
    val intResult = (getInt ?: 1) * number

    return string.filterNot { it.isDigit() } + intResult.toString()
}

fun main() {
    println(sumNumbersAndConcatToString("Kotlin000010", 100) == "Kotlin1000")
    println(sumNumbersAndConcatToString("kotlin", 99) == "kotlin99")
    println(sumNumbersAndConcatToString("kotlin123", 10) == "kotlin1230")
}