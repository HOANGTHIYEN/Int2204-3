/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class MaxvalueTest {
    

    /**
     * Test of Max method, of class Maxvalue.
     */
    @Test
    public void testMax1() {
        System.out.println("test_1");
        int expResult = 5;
        int result = Maxvalue.Max(4, 5);
        assertEquals(expResult, result);
    }
    @Test
    public void testMax2() {
        System.out.println("test_2");
        int expResult = 10;
        int result = Maxvalue.Max(5, 10);
        assertEquals(expResult, result);
    }
    @Test
    public void testMax3() {
        System.out.println("test_3");
        int expResult = 300;
        int result = Maxvalue.Max(300, 300);
        assertEquals(expResult, result);
    }
    @Test
    public void testMax4() {
        System.out.println("test_4");
        int expResult = 200000;
        int result = Maxvalue.Max(20000, 200000);
        assertEquals(expResult, result);
    }
    @Test
    public void testMax5() {
        System.out.println("test_5");
        int expResult = 300*200;
        int result = Maxvalue.Max(300*200, 500+300);
        assertEquals(expResult, result);
    }
}
