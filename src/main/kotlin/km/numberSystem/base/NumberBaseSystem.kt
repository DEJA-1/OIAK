package km.numberSystem.base

import km.numberSystem.Decimal
import km.numberSystem.NumberSystem
import kotlin.math.*

class NumberBaseSystem(val value: String, val base: Int) : NumberSystem<String>(value, base) {
    fun convertFromBaseToDecimal(): Decimal {
        require(base in 2..36) { "Base must be between 2 and 36" }

        return Decimal(getSumOfCharSequence(sequence = value))
    }

    fun convertFromBaseToBase(targetBase: Int): NumberBaseSystem {
        val doubleTargetBase = targetBase.toDouble()
        val doubleBase = base.toDouble()
        var result: Double = doubleBase

        var skippable = false
        var powIndex = 1;
        while (result <= doubleTargetBase) {
            result = doubleBase.pow(powIndex)
            if (result == doubleTargetBase) { skippable = true; break }
            powIndex++
        }

        if (skippable) { return convertFromBaseToBaseUsingExponent(targetBase) }

        val decimal = convertFromBaseToDecimal()
        return decimal.convertToBase(targetBase)
    }

    private fun convertFromBaseToBaseUsingExponent(targetBase: Int): NumberBaseSystem {
        val chunkSize = log(targetBase.toDouble(), base = base.toDouble()).toInt()

        var valueToChunk = value
        while (valueToChunk.length % chunkSize != 0) {
            valueToChunk = "0$valueToChunk"
        }

        val chunks = valueToChunk.chunked(chunkSize)

        var result = ""
        chunks.forEach { chunk ->
            val chunkSum = getSumOfCharSequence(sequence = chunk)
            result += chunkSum
        }

        return NumberBaseSystem(result, targetBase)
    }

    private fun getSumOfCharSequence(sequence: String): Int {
        var result = 0
        sequence.reversed().forEachIndexed { index, char ->
            val digit = if (char.isDigit()) char - '0' else char - '7'
            val multiplier = (base.toDouble().pow(index)).toInt()
            result += digit * multiplier
        }
        return result
    }
}
