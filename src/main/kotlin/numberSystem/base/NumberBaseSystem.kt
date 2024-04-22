package numberSystem.base

import numberSystem.Decimal
import numberSystem.NumberSystem
import kotlin.math.pow

class NumberBaseSystem(val value: String, val base: Int) : NumberSystem<String>(value, base) {
    fun convertFromBaseToDecimal(): Decimal {
        require(base in 2..36) { "Base must be between 2 and 36" }

        var result = 0

        value.reversed().forEachIndexed { index, char ->
            val digit = if (char.isDigit()) char - '0' else char - '7'
            val multiplier = (base.toDouble().pow(index)).toInt()
            result += digit * multiplier
        }

        return Decimal(result)
    }
}