import numberSystem.Decimal

fun main() {
    val value = 156124
    for (base in 2..36) {
        if (base == 10) continue
        if (base < 10) {
            Decimal(value)
                .convertToBaseUnder11(base)
                .printValue()
        } else {
            Decimal(value)
                .convertToBaseAbove11(base)
                .printValue()
        }
    }
}
