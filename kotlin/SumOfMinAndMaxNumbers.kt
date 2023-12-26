/**
 * The function takes Integer argument with digit lengths from 2 to 9.
 *
 * The function return an Integer which is the sum of the
 * smallest number and the largest number.
 */
fun sumOfMinAndMaxNumbers(number: Int): Int {
    val chunkedStr = number.toString().chunked(1)
    val isDigitInRange = chunkedStr.count() in 2.rangeTo(9)

    if (!isDigitInRange) return 0

    val strToInt = chunkedStr.distinct().map { it.toInt() }

    return strToInt.min() + strToInt.max()
}

fun main() {
    println(sumOfMinAndMaxNumbers(987234) == 11)
    println(sumOfMinAndMaxNumbers(8812334) == 9)
    println(sumOfMinAndMaxNumbers(10) == 1)
}