package numberSystem.base

import numberSystem.Decimal
import numberSystem.NumberSystem
import kotlin.math.pow


sealed class Base(open val value: String, open val base: Int) : NumberSystem<String>(value, base) {
    class Binary(value: String = "0") : Base(value, 2) {
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

    class Base3(value: String = "0") : Base(value, 3)
    class Base4(value: String = "0") : Base(value, 4)
    class Base5(value: String = "0") : Base(value, 5)
    class Base6(value: String = "0") : Base(value, 6)
    class Base7(value: String = "0") : Base(value, 7)
    class Base8(value: String = "0") : Base(value, 8)
    class Base9(value: String = "0") : Base(value, 9)

    class Base11(value: String = "0") : Base(value, 11)
    class Base12(value: String = "0") : Base(value, 12)
    class Base13(value: String = "0") : Base(value, 13)
    class Base14(value: String = "0") : Base(value, 14)
    class Base15(value: String = "0") : Base(value, 15)
    class Base16(value: String = "0") : Base(value, 16)
    class Base17(value: String = "0") : Base(value, 17)
    class Base18(value: String = "0") : Base(value, 18)
    class Base19(value: String = "0") : Base(value, 19)
    class Base20(value: String = "0") : Base(value, 20)
    class Base21(value: String = "0") : Base(value, 21)
    class Base22(value: String = "0") : Base(value, 22)
    class Base23(value: String = "0") : Base(value, 23)
    class Base24(value: String = "0") : Base(value, 24)
    class Base25(value: String = "0") : Base(value, 25)
    class Base26(value: String = "0") : Base(value, 26)
    class Base27(value: String = "0") : Base(value, 27)
    class Base28(value: String = "0") : Base(value, 28)
    class Base29(value: String = "0") : Base(value, 29)
    class Base30(value: String = "0") : Base(value, 30)
    class Base31(value: String = "0") : Base(value, 31)
    class Base32(value: String = "0") : Base(value, 32)
    class Base33(value: String = "0") : Base(value, 33)
    class Base34(value: String = "0") : Base(value, 34)
    class Base35(value: String = "0") : Base(value, 35)
    class Base36(value: String = "0") : Base(value, 36)

}