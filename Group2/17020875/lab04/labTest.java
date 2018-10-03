import com.sun.javafx.animation.TickCalculation;

import org.junit.Test;

import static org.junit.Assert.*;

public class labTest {

    /*
    test 1
     */
    @Test
    public void checkFindMax1() {
        int result = lab.findMax(2, 4);
        assertEquals(4, result);
    }
    @Test
    public void checkFindMax2() {
        int result = lab.findMax(4, -4);
        assertEquals(4, result);
    }
    @Test
    public void checkFindMax3() {
        int result = lab.findMax(4, 0);
        assertEquals(4, result);
    }
    @Test
    public void checkFindMax4() {
        int result = lab.findMax(-5, -2);
        assertEquals(-2, result);
    }
    @Test
    public void checkFindMax5() {
        int result = lab.findMax(4, -1);
        assertEquals(4, result);
    }
    @Test
    public void checkFindMax() {
        int result = lab.findMax(4, -1);
        assertEquals(4, result);
    }
    /*
    test2
     */
    @Test
    public void findMinArray1() {
        int result = lab.findMinArray(new int[]{-1, 3, 8, 9, 10, 98});
        assertEquals(-1, result);
    }
    @Test
    public void findMinArray2() {
        int result = lab.findMinArray(new int[]{3, 8, 9, 10, 98, -1});
        assertEquals(-1, result);
    }
    @Test
    public void findMinArray3() {
        int result = lab.findMinArray(new int[]{ 3, 8, 9, -1, 10, 98});
        assertEquals(-1, result);
    }
    @Test
    public void findMinArray4() {
        int result = lab.findMinArray(new int[]{222222222, 111111111, 333333333, 444444444});
        assertEquals(111111111, result);
    }
    @Test
    public void findMinArray5() {
        int result = lab.findMinArray(new int []{-11111, -22222, -33333, -44444});
        assertEquals(-44444, result);
    }
    /*
    test 3
     */
    @Test
    public void calBMI1() {
        String result = lab.calBMI(45,  1.65);
        assertEquals("Thi?u cân", result );
    }
    @Test
    public void calBMI2() {
        String result = lab.calBMI(54, 1.65);
        assertEquals("Bình thu?ng", result );
    }
    @Test
    public void calBMI3() {
       String result = lab.calBMI(65, 1.65);
        assertEquals("Th?a cân", result );
    }
    @Test
    public void calBMI4() {
        String result = lab.calBMI(80, 1.65);
        assertEquals("Béo phì", result );
    }
    @Test
    public void calBMI5() {
        String result = lab.calBMI(49, 1.65);
        assertEquals("Thi?u cân", result );
    }

}