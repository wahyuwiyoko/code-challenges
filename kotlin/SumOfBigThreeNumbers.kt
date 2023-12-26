fun sumOfBigThreeNumbers(vararg numbers: Int): Int = numbers.sortedDescending().take(3).sum()

fun main() {
    println(sumOfBigThreeNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9, 10) == 27)
    println(sumOfBigThreeNumbers(22, 20, 21, 25, 24) == 71)
    println(sumOfBigThreeNumbers(100, 1000, 30, 1) == 1130)
    println(sumOfBigThreeNumbers(22, 22, 33, 22) == 77)
}