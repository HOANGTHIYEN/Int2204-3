
package lab4;

import org.junit.Test;
import static org.junit.Assert.*;


public class MinvalueTest {
   
    @Test
    public void testMin1() {
        System.out.println("test_1");
        int sureResult = 1;
        int a[] = {2,3,6,1,7,4};
        int result = Minvalue.Minofarr(a);
        assertEquals(sureResult,result);   
    }
    @Test
    public void testMin2() {
        System.out.println("test_2");
        int sureResult = 3;
        int a[] = {3,5,7,4,7,5,5,5,5,45,6,5,6,65,56,34545,64364,7437,23537,532,45};
        int result = Minvalue.Minofarr(a);
        assertEquals(sureResult,result);   
    }
    @Test
    public void testMin3() {
        System.out.println("test_3");
        int sureResult = 7;
        int a[] = {43,45,543,643,7,35,75,75,36,77,58,52,52,6342,5242,523,543,52,542};
        int result = Minvalue.Minofarr(a);
        assertEquals(sureResult,result);   
    }
    @Test
    public void testMin4() {
        System.out.println("test_4");
        int sureResult = 6;
        int a[] = {45,6,8,12,6,56,78,213,5674123,135,1231456,5756,23,146,43,54,64,543,543};
        int result = Minvalue.Minofarr(a);
        assertEquals(sureResult,result);   
    }
    @Test
    public void testMin5() {
        System.out.println("test_5");
        int sureResult = 6;
        int a[] = {45,6,8,12,6,56,78,213,5674123,135,1231456,5756,23,146,43,54,64,543,543,45,6,8,12,6,56,78,213,5674123,135,1231456,5756,23,146,43,54,64,543,543};
        int result = Minvalue.Minofarr(a);
        assertEquals(sureResult,result);   
    }
    
}
