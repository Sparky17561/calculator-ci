package com.saiprasad.calculator_ci;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calc.add(10,5));
    }

    @Test
    void testSub() {
        assertEquals(5, calc.sub(10,5));
    }

    // These will fail until you add mul/div later
//    @Test
//    void testMul() {
//        assertEquals(50, calc.mul(10,5));
//    }
//
//    @Test
//    void testDiv() {
//        assertEquals(2, calc.div(10,5));
//    }
//
//    @Test
//    void testDivideByZero() {
//        Exception e = assertThrows(
//            ArithmeticException.class,
//            () -> calc.div(10,0)
//        );
//
//        assertEquals("Divide by zero", e.getMessage());
//    }
}