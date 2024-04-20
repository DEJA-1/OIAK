package numberSystem

open class NumberSystem<T>(private val value: T) {
    fun printValue() {
        println(value)
    }
}