package ro.ulbs.proiectaresoftware.lab6.advanced;
import ro.ulbs.proiectaresoftware.lab6.advanced.NewIntCalculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class NewIntCalculatorTest {
    //pb 6.8.1
    private NewIntCalculator calculator;
    @BeforeEach
    public void setUp() {
        calculator = new NewIntCalculator().init();
    }

    @Test
    public void testAddPositive() {
        calculator.add(5);
        Assertions.assertEquals(5, calculator.result());
    }
    @Test
    public void testAddNegative() {
        calculator.add(-5);
        Assertions.assertEquals(-5, calculator.result());
    }
    @Test
    public void testSubtractPositives() {
        calculator.subtract(5);
        Assertions.assertEquals(-5, calculator.result());
    }
    @Test
    public void testSubtractNegatives() {
        calculator.subtract(-5);
        Assertions.assertEquals(5, calculator.result());
    }
    @Test
    public void testMultiplyPositives() {
        calculator.add(3).multiply(5);
        Assertions.assertEquals(15, calculator.result());
    }
    @Test
    public void testMultiplyNegatives() {
        calculator.add(2).multiply(-5);
        Assertions.assertEquals(-10, calculator.result());
    }
    @Test
    public void testDividePositives() {
        calculator.add(10).divide(5);
        Assertions.assertEquals(2, calculator.result());
    }
    @Test
    public void testDivideNegatives() {
        calculator.add(10).divide(-5);
        Assertions.assertEquals(-2, calculator.result());
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}