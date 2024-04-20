package numberSystem

import numberSystem.base.Base

class Decimal(val value: Int) : NumberSystem<Int>(value, 10) {
    fun convertToBaseUnder11(base: Int): Base {
        if (base < 2 || base > 10) {
            throw IllegalArgumentException("Base must be greater than 1 and less than 11.")
        }

        if (value == 0) return when (base) {
            2 -> Base.Binary()
            3 -> Base.Base3()
            4 -> Base.Base4()
            5 -> Base.Base5()
            6 -> Base.Base6()
            7 -> Base.Base7()
            8 -> Base.Base8()
            9 -> Base.Base9()
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
            2 -> Base.Binary(result)
            3 -> Base.Base3(result)
            4 -> Base.Base4(result)
            5 -> Base.Base5(result)
            6 -> Base.Base6(result)
            7 -> Base.Base7(result)
            8 -> Base.Base8(result)
            9 -> Base.Base9(result)
            else -> throw IllegalArgumentException("Unsupported base.")
        }
    }

    fun convertToBaseAbove11(base: Int): Base {
        if (base < 11 || base > 36) {
            throw IllegalArgumentException("Base must be greater than 11 and less than 36.")
        }

        if (value == 0) return when (base) {
            11 -> Base.Base11()
            12 -> Base.Base12()
            13 -> Base.Base13()
            14 -> Base.Base14()
            15 -> Base.Base15()
            16 -> Base.Base16()
            17 -> Base.Base17()
            18 -> Base.Base18()
            19 -> Base.Base19()
            20 -> Base.Base20()
            21 -> Base.Base21()
            22 -> Base.Base22()
            23 -> Base.Base23()
            24 -> Base.Base24()
            25 -> Base.Base25()
            26 -> Base.Base26()
            27 -> Base.Base27()
            28 -> Base.Base28()
            29 -> Base.Base29()
            30 -> Base.Base30()
            31 -> Base.Base31()
            32 -> Base.Base32()
            33 -> Base.Base33()
            34 -> Base.Base34()
            35 -> Base.Base35()
            36 -> Base.Base36()
            else -> throw IllegalArgumentException("Unsupported base.")
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
        return when (base) {
            11 -> Base.Base11(result)
            12 -> Base.Base12(result)
            13 -> Base.Base13(result)
            14 -> Base.Base14(result)
            15 -> Base.Base15(result)
            16 -> Base.Base16(result)
            17 -> Base.Base17(result)
            18 -> Base.Base18(result)
            19 -> Base.Base19(result)
            20 -> Base.Base20(result)
            21 -> Base.Base21(result)
            22 -> Base.Base22(result)
            23 -> Base.Base23(result)
            24 -> Base.Base24(result)
            25 -> Base.Base25(result)
            26 -> Base.Base26(result)
            27 -> Base.Base27(result)
            28 -> Base.Base28(result)
            29 -> Base.Base29(result)
            30 -> Base.Base30(result)
            31 -> Base.Base31(result)
            32 -> Base.Base32(result)
            33 -> Base.Base33(result)
            34 -> Base.Base34(result)
            35 -> Base.Base35(result)
            36 -> Base.Base36(result)
            else -> throw IllegalArgumentException("Unsupported base.")
        }
    }
}