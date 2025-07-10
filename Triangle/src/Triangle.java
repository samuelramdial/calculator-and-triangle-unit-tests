// Triangle.java - inspired by code in OpenDSA's book

/**
 * ITSC 2214 Examples.
 *
 * @author samue
 */
public class Triangle
{

    /**
     * Calculates the type of triangle returning.
     * 0 = not a triangle
     * 1 = equilateral
     * 2 = isosceles
     * 3 = scalene
     * @param s1 the length of the first side of the triangle
     * @param s2 the length of the second side of the triangle
     * @param s3 the length of the third side of the triangle
     * @return the type of triangle classified by an integer
     */
    public static int classifyTriangle(int s1, int s2, int s3)
    {
        // coverage
        if (s1 < 0 || s2 < 0 || s3 < 0) {
            return 0;
        }
        else if (s1 == 0) {
            return 0;
        }
        else if (s2 == 0) {
            return 0;
        }
        else if (s3 == 0) {
            return 0;
        }
        else if (s1 - s2 == s3) {
            return 0;
        }
        else if (s2 - s1 == s3) {
            return 0;
        }
        else if (s3 - s2 == s1) {
            return 0;
        }
        else if (s1 - s2 > s3) {
            return 0;
        }
        else if (s2 - s1 > s3) {
            return 0;
        }
        else if (s3 - s2 > s1) {
            return 0;
        }
        else if (s1 == s2 && s1 == s3 && s2 == s3) {
            return 1;
        }
        else if (s1 != s2 && s1 != s3 && s2 != s3) {
            return 3;
        }
        else {
            return 2;
        }
    }
}
