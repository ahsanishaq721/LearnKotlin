package concepts

/**
 * A simple program to demonstrate the use of lambda expressions in Kotlin
 * with a single abstract method (SAM) interface.
 */

fun main() {
    // Calling sayGreeting without lambda using an anonymous class
    sayGreeting(object : Greeting {
        override fun sayHello() {
            println("Hello, how are you?")
        }
    })

    // Calling sayGreeting with lambda
    sayGreeting { println("Hello, how are you?") }

    // Calling sayGreeting with a class implementation
    val englishGreeting = EnglishGreeting()
    sayGreeting(englishGreeting)
}

class EnglishGreeting : Greeting {
    override fun sayHello() {
        println("Hello, how are you?")
    }
}

/**
 * A functional interface (SAM - Single Abstract Method) to be used with lambda expressions.
 */
fun interface Greeting {
    fun sayHello()
}

/**
 * A function that accepts an instance of the Greeting interface and calls its sayHello method.
 *
 * @param greeting An instance of the Greeting interface.
 */
fun sayGreeting(greeting: Greeting) {
    greeting.sayHello()
}