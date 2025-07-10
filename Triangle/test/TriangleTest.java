// TriangleTest.java - inspired by code in OpenDSA's book.

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Test class for Triangle.
 *
 * @author Samuel Ramdial
 */
public class TriangleTest
{

    /**
     * Check that the values given do not form a triangle.
     */
    @Test
    public void testNotATriangle()
    {
        // call the constructor of the triangle class
        assertNotNull(new Triangle());
        int r = Triangle.classifyTriangle(3, 4, 55);
        assertEquals("This should not be a triangle", 0, r);
        // s1 - s2 == s3
        r = Triangle.classifyTriangle(100, 50, 50);
        assertEquals("This should not be a triangle", 0, r);
        // s2 - s1 == s3
        r = Triangle.classifyTriangle(50, 100, 50);
        assertEquals("This should not be a triangle", 0, r);
        // s3 - s2 == s1
        r = Triangle.classifyTriangle(50, 50, 100);
        assertEquals("This should not be a triangle", 0, r);
        // s1 - s2 > s3
        r = Triangle.classifyTriangle(100, 50, 49);
        assertEquals("This should not be a triangle", 0, r);
        // s2 - s1 > s3
        r = Triangle.classifyTriangle(50, 100, 49);
        assertEquals("This should not be a triangle", 0, r);
        // s3 - s2 > s1
        r = Triangle.classifyTriangle(49, 50, 100);
        assertEquals("This should not be a triangle", 0, r);
    }

    /**
     * Check that the values given form a scalene triangle.
     */
    @Test
    public void testScalene()
    {
        int r = Triangle.classifyTriangle(3, 4, 5);
        assertEquals("This should be an scalene triangle", 3, r);
    }

    /**
     * Check that the values given form an isosceles triangle.
     */
    @Test
    public void testIsoceles()
    {
        int r = Triangle.classifyTriangle(10, 10, 6);
        assertEquals("This should be an isoceles triangle", 2, r);
    }

    /**
     * Check that the values given form an equilateral triangle.
     */
    @Test
    public void testEquilateral()
    {
        int r = Triangle.classifyTriangle(10, 10, 10);
        assertEquals("This should be an equilateral triangle", 1, r);
        r = Triangle.classifyTriangle(50, 50, 50);
        assertEquals("This should be an equilateral trianglge", 1, r);
    }

    /**
     * Check that the values given create coverage that all sides are 0.
     */
    @Test
    public void testAllZeroes()
    {
        int r = Triangle.classifyTriangle(0, 0, 0);
        assertEquals("calling it with all 0s", 0, r);
        r = Triangle.classifyTriangle(0, 1, 2);
        assertEquals("calling it with s1 = 0", 0, r);
        r = Triangle.classifyTriangle(1, 0, 2);
        assertEquals("calling it with s2 = 0", 0, r);
        r = Triangle.classifyTriangle(1, 3, 0);
        assertEquals("calling it with s3 = 0", 0, r);
    }

    /**
     * Check that the triangle is classified as a scalene with three different
     * sides.
     */
    @Test
    public void test3DiffSides()
    {
        int s1 = 15;
        int s2 = 34;
        int s3 = 32;

        int r = Triangle.classifyTriangle(s1, s2, s3);
        assertEquals("Scalene with three different sides", 3, r);
    }

    // Add more tests to increase coverage, shown by pink
    // line highlight in the source code view in Web-CAT
    /**
     * Check that negative values do not classify as a triangle.
     */
    @Test
    public void testNegativeSides()
    {
        int r = Triangle.classifyTriangle(-1, -2, -3);
        assertEquals("Problems with negative values", 0, r);
        // s1 < 0
        r = Triangle.classifyTriangle(-1, 1, 2);
        assertEquals("Problems with negative values", 0, r);
        // s2 < 0
        r = Triangle.classifyTriangle(1, -1, 2);
        assertEquals("Problems with negative values", 0, r);
        // s3 < 0
        r = Triangle.classifyTriangle(1, 2, -1);
        assertEquals("Problems with negative values", 0, r);
    }
}
