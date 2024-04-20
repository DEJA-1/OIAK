import numberSystem.Binary
import numberSystem.Decimal

fun main(args: Array<String>) {
    val binaryToDecimal = Binary(value = "1110")
        .toDecimal()
        .printValue()

    val sampleDecimal = Decimal(value = 14)

    val decimalToBinary = sampleDecimal
        .convertToBase(base = 2)
        .printValue()

    val decimalToBase3 = sampleDecimal
        .convertToBase(base = 3)
        .printValue()

    val decimalToBase4 = sampleDecimal
        .convertToBase(base = 4)
        .printValue()
}