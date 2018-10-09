
package lab4;

import org.junit.Test;
import static org.junit.Assert.*;


public class MaxvalueTest {
    

    
    @Test
    public void testMax1() {
        System.out.println("test_1");
        int sureResult = 6;
        int result = Maxvalue.Max(3, 6);
        assertEquals(sureResult, result);
    }
    @Test
    public void testMax2() {
        System.out.println("test_2");
        int sureResult = 34;
        int result = Maxvalue.Max(7, 34);
        assertEquals(sureResult, result);
    }
    @Test
    public void testMax3() {
        System.out.println("test_3");
        int sureResult = 40;
        int result = Maxvalue.Max(30, 40);
        assertEquals(sureResult, result);
    }
    @Test
    public void testMax4() {
        System.out.println("test_4");
        int sureResult = 100000000;
        int result = Maxvalue.Max(100000000, 100000000);
        assertEquals(sureResult, result);
    }
    @Test
    public void testMax5() {
        System.out.println("test_5");
        int sureResult = 2*3;
        int result = Maxvalue.Max(3*1, 2*3);
        assertEquals(sureResult, result);
    }
}
