package concepts.loops

fun main() {
    /* In kotlin we can declare for loop as following
      * Let's say we want to print numbers from 1 to 10
      * we can write it in following ways
     */

    /*
    * using ranges
     */
    for (i in 1..10) {
        print(i)
    }
    println()

    /*
    * using ranges
     */
    for (i in 1 until 11) {
        print(i)
    }
    println()

    // we can write until as following, which is recommended
    for (i in 1..<11) {
        print(i)
    }
    println()

    // by declaring range variable
    val range = 1..10
    for (i in range) {
        print(i)
    }
    println()

    // by using step keyword
    for (i in 1..10 step 1) {
        print(i)
    }
}