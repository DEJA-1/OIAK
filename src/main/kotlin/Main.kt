import numberSystem.Decimal

fun main() {
    val value = 156124
    for (base in 2..36) {
        if (base == 10) continue
        val decimalToBase = Decimal(value)
            .convertToBase(base)

        decimalToBase.printValue()

        decimalToBase.convertFromBaseToDecimal().printValue()
    }
}
