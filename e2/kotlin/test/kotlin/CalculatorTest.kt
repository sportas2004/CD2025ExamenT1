package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun `add should return sum of two integers`() {
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }

    @Test
    fun `subtract should return difference of two integers`() {
        val result = calculator.subtract(10, 4)
        assertEquals(6, result)
    }

    @Test
    fun `multiply should return product of two integers`() {
        val result = calculator.multiply(3, 5)
        assertEquals(15, result)
    }

    @Test
    fun `divide should return integer division of two integers`() {
        val result = calculator.divide(10, 2)
        assertEquals(5, result)
    }

    @Test
    fun `divide should throw exception when divisor is zero`() {
        assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10, 0)
        }
    }
}

