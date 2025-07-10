
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

//-------------------------------------------------------------------------
/**
 * Test class for Calculator.
 *
 * @author Stephen Edwards
 * @version 2006.06.14
 */
public class CalculatorTest
{
    //~ Setup .................................................................

    //~ Instance/static variables .............................................
    private Calculator calc;

    // ----------------------------------------------------------
    /**
     * Creates a new Calculator object with zero in the accumulator.
     */
    @Before
    public void setUp()
    {
        calc = new Calculator();
    }

    //~ Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Check that a new calculator starts off with a zero value.
     */
    @Test
    public void initial()
    {
        // Add your own test actions here
        assertEquals(0, calc.getValue());
    }

    // ----------------------------------------------------------
    /**
     * Check setValue/getValue.
     */
    @Test
    public void setValue()
    {
        // Add your own test actions here
        calc.setValue(10);
        assertEquals(10, calc.getValue());
    }

    // ----------------------------------------------------------
    /**
     * Check that clear returns the accumulator to zero.
     */
    @Test
    public void clear()
    {
        // Add your own test actions here
        calc.clear();
        assertEquals(0, calc.getValue());
    }

    // ----------------------------------------------------------
    /**
     * Check that add works on zero and non-zero accumulators.
     */
    @Test
    public void addition()
    {
        // Add your own test actions here
        calc.setValue(10);
        calc.add(5);
        assertEquals(15, calc.getValue());

        calc.setValue(4);
        calc.add(0);
        assertEquals(4, calc.getValue());
    }

    // ----------------------------------------------------------
    /**
     * Check that subtract works on zero and non-zero accumulators.
     */
    @Test
    public void subtraction()
    {
        calc.setValue(10);
        calc.subtract(5);
        assertEquals(5, calc.getValue());

        calc.setValue(12);
        calc.subtract(0);
        assertEquals(12, calc.getValue());
    }

    // ----------------------------------------------------------
    /**
     * Check that multiplyBy works on non-zero accumulators.
     */
    @Test
    public void multiplication()
    {
        calc.setValue(6);
        calc.multiplyBy(5);
        assertEquals(30, calc.getValue());
    }

    // ----------------------------------------------------------
    /**
     * Check that divideBy works on non-zero accumulators.
     */
    @Test
    public void division()
    {
        // Add your own test actions here
        calc.setValue(20);
        calc.divideBy(5);
        assertEquals(4, calc.getValue());
    }
}
