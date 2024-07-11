package concepts

fun main() {
    sayGreeting { println("Hello how are you?") }
}

fun interface Greeting {
    fun sayHello()
}

fun sayGreeting(greeting: Greeting) {
    greeting.sayHello()
}