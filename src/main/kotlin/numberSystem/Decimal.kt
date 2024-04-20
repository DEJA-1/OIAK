package numberSystem

class Decimal(val value: Int) : NumberSystem<Int>(value) {
    fun convertToBase(base: Int): NumberSystem<String> {
        if (base < 1) {
            throw IllegalArgumentException("Base must be greater than 1.")
        }

        if (value == 0) return when (base) {
            2 -> Binary()
            3 -> Base3()
            4 -> Base4()
            else -> throw IllegalArgumentException("Unsupported base.")
        }

        var num = value
        var result = ""

        while (num > 0) {
            val remainder = num % base
            result += remainder
            num /= base
        }

        result = result.reversed()
        return when (base) {
            2 -> Binary(result)
            3 -> Base3(result)
            4 -> Base4(result)
            else -> throw IllegalArgumentException("Unsupported base.")
        }
    }
}