import numberSystem.Decimal
import numberSystem.base.NumberBaseSystem

fun main() {
    val value = 156124
    for (base in 2..36) {
        if (base == 10) continue
        val decimalToBase = Decimal(value)
            .convertToBase(base)

        decimalToBase.printValue()

        decimalToBase.convertFromBaseToDecimal().printValue()
    }

    val b34 = NumberBaseSystem("3X1U", 34)
    b34.convertFromBaseToBase(targetBase = 2).printValue()
}
