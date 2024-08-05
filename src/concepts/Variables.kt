package concepts

fun main() {
    /**
     * Demonstration of 'var' keyword in Kotlin
     * 'var' is mutable, meaning the value of the variable can be changed.
     */
    var number = 28
    var name = "Amit"
    var alphabet = 'M'
    var profit = 58.98987F
    var profitValue = 578.4575759612347
    var isLoved = true

    println("Number: $number")
    println("Name: $name")
    println("Alphabet: $alphabet")
    println("Profit: $profit")
    println("Profit Value: $profitValue")
    println("Is Loved: $isLoved")

    /**
     * Demonstration of 'val' keyword in Kotlin
     * 'val' is immutable, meaning the value of the variable cannot be changed once assigned.
     */

    val num = 7
    val personName = "Manisha"
    val letter = 'A'
    val loss = 0.08F
    val lossValue = 6878.544800
    val isHated = false
    // changing any of above variable will create compile time error

    println("Number: $num")
    println("Person Name: $personName")
    println("Letter: $letter")
    println("Loss: $loss")
    println("Loss Value: $lossValue")
    println("Is Hated: $isHated")
}