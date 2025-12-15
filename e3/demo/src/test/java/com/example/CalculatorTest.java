package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add_shouldReturnSum() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void subtract_shouldReturnDifference() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void multiply_shouldReturnProduct() {
        int result = calculator.multiply(3, 5);
        assertEquals(15, result);
    }

    @Test
    void divide_shouldReturnQuotient() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    void divide_shouldThrowExceptionWhenDivisorIsZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
