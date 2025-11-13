package edu.pnu.badcalc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Calculator class
 * Tests basic arithmetic operations after bug fixes
 */
class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    /**
     * Test addition with positive numbers
     */
    @Test
    void testAddPositiveNumbers() {
        double result = calculator.add(2, 3);
        assertEquals(5.0, result, 0.0001, "2 + 3 should equal 5");
    }
    
    /**
     * Test addition with negative numbers
     */
    @Test
    void testAddNegativeNumbers() {
        double result = calculator.add(-2, -3);
        assertEquals(-5.0, result, 0.0001, "-2 + (-3) should equal -5");
    }
    
    /**
     * Test addition with zero
     */
    @Test
    void testAddWithZero() {
        double result = calculator.add(5, 0);
        assertEquals(5.0, result, 0.0001, "5 + 0 should equal 5");
    }
    
    /**
     * Test subtraction with positive result
     */
    @Test
    void testSubtractPositiveResult() {
        double result = calculator.subtract(5, 3);
        assertEquals(2.0, result, 0.0001, "5 - 3 should equal 2");
    }
    
    /**
     * Test subtraction with negative result
     * This was failing before the fix (Math.abs removed)
     */
    @Test
    void testSubtractNegativeResult() {
        double result = calculator.subtract(3, 5);
        assertEquals(-2.0, result, 0.0001, "3 - 5 should equal -2");
    }
    
    /**
     * Test subtraction resulting in zero
     */
    @Test
    void testSubtractResultZero() {
        double result = calculator.subtract(5, 5);
        assertEquals(0.0, result, 0.0001, "5 - 5 should equal 0");
    }
    
    /**
     * Test multiplication with positive numbers
     */
    @Test
    void testMultiplyPositiveNumbers() {
        double result = calculator.multiply(4, 5);
        assertEquals(20.0, result, 0.0001, "4 * 5 should equal 20");
    }
    
    /**
     * Test multiplication with decimal numbers
     * This was failing before the fix (int conversion removed)
     */
    @Test
    void testMultiplyDecimalNumbers() {
        double result = calculator.multiply(2.5, 4.0);
        assertEquals(10.0, result, 0.0001, "2.5 * 4.0 should equal 10.0");
    }
    
    /**
     * Test multiplication with zero
     */
    @Test
    void testMultiplyWithZero() {
        double result = calculator.multiply(5, 0);
        assertEquals(0.0, result, 0.0001, "5 * 0 should equal 0");
    }
    
    /**
     * Test multiplication with negative numbers
     */
    @Test
    void testMultiplyNegativeNumbers() {
        double result = calculator.multiply(-3, 4);
        assertEquals(-12.0, result, 0.0001, "-3 * 4 should equal -12");
    }
    
    /**
     * Test division with positive numbers
     */
    @Test
    void testDividePositiveNumbers() {
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0001, "10 / 2 should equal 5");
    }
    
    /**
     * Test division with decimal result
     */
    @Test
    void testDivideDecimalResult() {
        double result = calculator.divide(7, 2);
        assertEquals(3.5, result, 0.0001, "7 / 2 should equal 3.5");
    }
}
