package concepts

fun main() {

    /**
     * Arithmetic Operators
     */
    val num1 = 58.5
    val num2 = 6.5

    var result: Double

    result = num1 + num2
    println("Addition: $result")

    result = num1 - num2
    println("Subtraction: $result")

    result = num1 * num2
    println("Multiplication: $result")

    result = num1 / num2
    println("Division: $result")

    result = num1 % num2
    println("Modulus: $result")

    /**
     * Comparison Operators - Returns Boolean result
     */
    val num3 = 58.6
    val num4 = 6.5

    var comparisonResult: Boolean

    comparisonResult = num3 == num4
    println("Equal to: $comparisonResult")

    comparisonResult = num3 != num4
    println("Not equal to: $comparisonResult")

    comparisonResult = num3 < num4
    println("Less than: $comparisonResult")

    comparisonResult = num3 > num4
    println("Greater than: $comparisonResult")

    comparisonResult = num3 <= num4
    println("Less than or equal to: $comparisonResult")

    comparisonResult = num3 >= num4
    println("Greater than or equal to: $comparisonResult")

    /**
     * Assignment Operators
     */
    var num5 = 58.5
    val num6 = 6.5

    num5 += num6
    println("Addition assignment: $num5")

    num5 -= num6
    println("Subtraction assignment: $num5")

    num5 *= num6
    println("Multiplication assignment: $num5")

    num5 /= num6
    println("Division assignment: $num5")

    num5 %= num6
    println("Modulus assignment: $num5")

    /**
     * Increment & Decrement Operators
     */
    var num7 = 45
    var num8 = 30
    var num9 = 50
    var num10 = 65

    println("Initial num7: $num7")
    num7++
    println("Post-increment num7: $num7")

    println("Initial num8: $num8")
    num8--
    println("Post-decrement num8: $num8")

    println("Pre-increment num9: ${++num9}")
    println("Pre-decrement num10: ${--num10}")

    println("Post-increment num9: ${num9++}")
    println("Post-decrement num10: ${num10--}")
}