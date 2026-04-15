package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DoubleCalculatorTest {
    //pb 6.8.1
    private DoubleCalculator dCalculator;
    @BeforeEach
    public void setUp() {
        dCalculator = new DoubleCalculator().init();
    }
    @Test
    public void testAddPositive() {
        dCalculator.add(2.5);
        Assertions.assertEquals(2.5, dCalculator.result());
    }
    @Test
    public void testAddNegative() {
        dCalculator.add(-2.5);
        Assertions.assertEquals(-2.5, dCalculator.result());
    }
    @Test
    public void testSubtractPositive() {
        dCalculator.subtract(2.5);
        Assertions.assertEquals(-2.5, dCalculator.result());
    }
    @Test
    public void testSubtractNegative() {
        dCalculator.subtract(-2.5);
        Assertions.assertEquals(2.5, dCalculator.result());
    }
    @Test
    public void testMultiplyPositive() {
        dCalculator.add(2.5).multiply(2.5);
        Assertions.assertEquals(6.25, dCalculator.result());
    }
    @Test
    public void testMultiplyNegative() {
        dCalculator.add(2.5).multiply(-2.5);
        Assertions.assertEquals(-6.25, dCalculator.result());
    }
    @Test
    public void testDividePositive() {
        dCalculator.add(5.0).divide(2.5);
        Assertions.assertEquals(2.0, dCalculator.result());
    }
    @Test
    public void testDivideNegative() {
        dCalculator.add(-5.0).divide(2.5);
        Assertions.assertEquals(-2.0, dCalculator.result());
    }
    @AfterEach
    public void tearDown() {
        dCalculator = null;
    }
}
