package programs

fun main() {
    val intArray = intArrayOf(1, 2, 3, 5, 7, 8, 9)
    findConsecutiveOddNumbers(intArray)
}

fun findConsecutiveOddNumbers(arr: IntArray) {
    for (i in 0..<arr.size - 2) {
        if (arr[i] % 2 != 0 &&
            arr[i + 1] % 2 != 0 &&
            arr[i + 2] % 2 != 0
        ) {
            println("Found consecutive odd numbers: ${arr[i]}, ${arr[i + 1]}, ${arr[i + 2]}")
        }
    }
}