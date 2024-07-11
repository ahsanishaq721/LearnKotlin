package programs

fun main() {

    val arrayToReverse = intArrayOf(1, 2, 3, 4, 5)
    val reversedArray = reverseTheArray(arrayToReverse)
    for (i in reversedArray) {
        print(i)
    }
}

fun reverseTheArray(arrayToReverse: IntArray): IntArray {
    val reversedArray = IntArray(arrayToReverse.size) // Use IntArray
    var count = 0
    for (i in arrayToReverse.indices.reversed()) {
        reversedArray[count++] = arrayToReverse[i]
    }
    return reversedArray
}