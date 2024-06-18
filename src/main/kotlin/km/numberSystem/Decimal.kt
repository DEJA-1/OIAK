package km.numberSystem

import km.numberSystem.base.NumberBaseSystem

class Decimal(private val value: Int) : NumberSystem<Int>(value, 10) {
    fun convertToBase(base: Int): NumberBaseSystem {
        if (base < 2 || base > 36) {
            throw IllegalArgumentException("Base must be greater than 2 and less than 36.")
        }

        if (value == 0) {
            NumberBaseSystem(value = "0", base = base)
        }

        var num = value
        var result = ""

        while (num > 0) {
            val remainder = num % base
            val digit = if (remainder < 10) remainder else ('A' + (remainder - 10))
            result += digit
            num /= base
        }

        result = result.reversed()
        return NumberBaseSystem(result, base)
    }
}