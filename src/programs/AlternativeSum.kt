package programs

fun main() {
    val sum = alternativeSum(10, 3, 2, 4, 6)
    println("alternative sum is $sum")

}

fun alternativeSum(vararg numbers: Int): Int {
    var sum = 0
    var toggle = true
    for (number in numbers) {
        if (toggle) {
            sum += number
        } else {
            sum -= number
        }

        toggle = !toggle
    }

    return sum
}