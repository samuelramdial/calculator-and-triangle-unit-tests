
// -------------------------------------------------------------------------
/**
 * This class represents a simple calculator that contains a single
 * integer accumulator. It provides basic methods to set/get/clear the
 * accumulator's value, as well as to add, subtract, multiply, and
 * divide. All operations leave their results in the accumulator for
 * further manipulation.
 *
 * @author Stephen Edwards
 * @version 2006.06.14
 */
public class Calculator
{
    //~ Instance/static variables .............................................

    private int value;

    //~ Constructor ...........................................................
    // ----------------------------------------------------------
    /**
     * Creates a new Calculator object with zero in the accumulator.
     */
    public Calculator()
    {
        value = 0;
    }

    //~ Public Methods ........................................................
    // ----------------------------------------------------------
    /**
     * Retrieve the current value stored in the accumulator.
     * @return the accumulator's value
     */
    public int getValue()
    {
        return value;
    }

    // ----------------------------------------------------------
    /**
     * Sets the value of the accumulator to a new value.
     * @param val the new accumulator value
     */
    void setValue(int val)
    {
        value = val;
    }

    // ----------------------------------------------------------
    /**
     * Clears the accumulator by setting its value to zero.
     */
    void clear()
    {
        setValue(0);
    }

    // ----------------------------------------------------------
    /**
     * Update the accumulator by adding a number to it.
     * @param val the amount to add
     */
    void add(int val)
    {
        setValue(getValue() + val);
    }

    // ----------------------------------------------------------
    /**
     * Update the accumulator by subtracting a number from it.
     * @param val the amount to subtract
     */
    void subtract(int val)
    {
        setValue(getValue() - val);
    }

    // ----------------------------------------------------------
    /**
     * Update the accumulator by multiplying a number from it.
     * @param val the amount to multiply by
     */
    void multiplyBy(int val)
    {
        setValue(getValue() * val);
    }

    // ----------------------------------------------------------
    /**
     * Update the accumulator by dividing a number from it.
     * @param val the amount to divide by
     */
    void divideBy(int val)
    {
        try {
            setValue(getValue() / val);
        } catch (ArithmeticException e) {
            System.out.println("Can't be divided by Zero: " + e);
        }
    }
}
