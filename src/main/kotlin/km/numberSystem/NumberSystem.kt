package km.numberSystem

open class NumberSystem<T>(private val value: T, private val base: Int) {
    fun printValue() {
        println("Base $base: $value")
    }
}