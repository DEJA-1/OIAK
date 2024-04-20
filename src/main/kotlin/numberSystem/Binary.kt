package numberSystem

import kotlin.math.pow

class Binary(private val value: String = "0") : BaseNumberSystem(value) {
    fun toDecimal(): Decimal {
        var decimal = 0.0
        var power = 0

        for (i in value.length - 1 downTo 0) {
            val currentDigit = value[i].digitToInt()
            decimal += currentDigit * 2.0.pow(power)
            power++
        }

        return Decimal(value = decimal.toInt())
    }
}