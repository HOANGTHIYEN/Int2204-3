/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author My PC
 */
public class MangTest {
    
    public MangTest() {
    }
    @Test
   
    public void testBmi() {
        
        String a = Mang.bmi(50,1.55);
		assertEquals("binh thuong", a);
     
    }
     @Test
   
    public void testBmi2() {
        
        String a = Mang.bmi(40,1.48);
		assertEquals("thieu can", a);
     
    }
    @Test
   
    public void testBmi3() {
        
        String a = Mang.bmi(89,1.66);
		assertEquals("beo phi", a);
     
    }
@Test
   
    public void testBmi4() {
        
        String a = Mang.bmi(52,1.61);
		assertEquals("binh thuong", a);
     
    }
@Test
   
    public void testBmi5() {
        
        String a = Mang.bmi(68,1.66);
		assertEquals("thua can", a);
     
    }
    
    @Test
    public void testSosanh() {
        
        
        int c = 6;
        int b = 7;
        int expResult = 7;
        int result = Mang.sosanh(c, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of nvs method, of class Mang.
     */
     @Test
    public void testSosanh2() {
        
        
        int c = 8;
        int b = 7;
        int expResult = 8;
        int result = Mang.sosanh(c, b);
        assertEquals(expResult, result);
        
    
    }
     @Test
    public void testSosanh3() {
        
        
        int c = 6;
        int b = 9;
        int expResult = 9;
        int result = Mang.sosanh(c, b);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testSosanh4() {
        
        
        int c = 6;
        int b = 2;
        int expResult = 6;
        int result = Mang.sosanh(c, b);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testSosanh5() {
        
        
        int c = 6;
        int b = 1;
        int expResult = 6;
        int result = Mang.sosanh(c, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testNvs() {
        int[] a = {3,4,5,6};
        int n = 4;
        int expResult = 3;
        int result = Mang.nvs(a, n);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testNvs2() {
        int[] a = {2,3,4,5,6};
        int n = 5;
        int expResult = 2;
        int result = Mang.nvs(a, n);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testNvs3() {
        int[] a = {1,3,4,5,6};
        int n = 5;
        int expResult = 1;
        int result = Mang.nvs(a, n);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testNvs4() {
        int[] a = {7,4,5,6};
        int n = 4;
        int expResult = 4;
        int result = Mang.nvs(a, n);
        assertEquals(expResult, result);
       
    }
    @Test
    public void testNvs5() {
        int[] a = {1,4,5,6};
        int n = 4;
        int expResult = 1;
        int result = Mang.nvs(a, n);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of main method, of class Mang.
     */
    
    
}
