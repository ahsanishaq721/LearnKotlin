package programs

fun main() {
    val numbs = intArrayOf(1, 2, 2, 3)
    val count = removeDuplicate(numbs)
    println(count)
}

fun removeDuplicate(numbs: IntArray): Int {// [1,2,2,3]
    if (numbs.isEmpty()) return 0
    var index = 0
    for (i in 0..<numbs.size - 1) {
        if (numbs[i] != numbs[i + 1]) {
            numbs[index++] = numbs[i]
        }
    }
    return index + 1
}