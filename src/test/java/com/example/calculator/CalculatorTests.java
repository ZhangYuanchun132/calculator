package com.example.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTests {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    // 新增的乘法测试
    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    // 新增的除法测试
    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(6, 3));
    }

    // 新增的除零异常测试
    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}
