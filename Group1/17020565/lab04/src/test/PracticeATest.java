package test;

import com.PracticeA;
import junit.framework.TestCase;

import static org.junit.Assert.assertNotEquals;

public class PracticeATest extends TestCase {
    @org.junit.Test
    public void testGetMax() {
        double num1 = 12.0;
        double num2 = 13.0;
        assertEquals(num2, PracticeA.getMax(num1, num2));
    }

    public void testGetMax2() {
        double num1 = 14.0;
        double num2 = 13.0;
        assertNotEquals(num2, PracticeA.getMax(num1, num2));
    }

    public void testGetMax3() {
        double num1 = 1.0;
        double num2 = 13.0;
        assertEquals(num2, PracticeA.getMax(num1, num2));
    }

    public void testGetMax4() {
        double num1 = 6.99;
        double num2 = 7.01;
        assertEquals(num2, PracticeA.getMax(num1, num2));
    }

    public void testGetMax5() {
        double num1 = -2;
        double num2 = -2.01;
        assertNotEquals(num2, PracticeA.getMax(num1, num2));
    }
}
