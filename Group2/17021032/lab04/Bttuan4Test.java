/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttuan4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thang
 */
public class Bttuan4Test {
    
    public Bttuan4Test() {
    }

    /**
     * Test of Max_int method, of class Bttuan4.
     */
    @Test
    public void testMax_int0() {
        System.out.println("Max_int");
        int a = 0;
        int b = 6;
        int expResult = 6;
        int result = Bttuan4.Max_int(a, b);
        assertEquals(expResult, result);
        
    }
	@Test
    public void testMax_int1() {
        System.out.println("Max_int");
        int a = 52;
        int b = 6;
        int expResult = 52;
        int result = Bttuan4.Max_int(a, b);
        assertEquals(expResult, result);
        
    }
	@Test
    public void testMax_int2() {
        System.out.println("Max_int");
        int a = 3;
        int b = 6;
        int expResult = 6;
        int result = Bttuan4.Max_int(a, b);
        assertEquals(expResult, result);
        
    }
	@Test
    public void testMax_int3() {
        System.out.println("Max_int");
        int a = -1;
        int b = 6;
        int expResult = 6;
        int result = Bttuan4.Max_int(a, b);
        assertEquals(expResult, result);
        
    }
	@Test
    public void testMax_int4() {
        System.out.println("Max_int");
        int a = 0;
        int b = -10;
        int expResult = 0;
        int result = Bttuan4.Max_int(a, b);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of Min_Array method, of class Bttuan4.
     */
    @Test
    public void testMin_Array0() {
        System.out.println("Min_Array");
        int  a[] = new int[] {1,2,3,4,5};        
        int expResult = 1;
        int result = Bttuan4.Min_Array(a);
        assertEquals(expResult, result);
       
    }
	@Test
    public void testMin_Array1() {
        System.out.println("Min_Array");
        int  a[] = new int[] {-1,2,3,4,5};        
        int expResult = -1;
        int result = Bttuan4.Min_Array(a);
        assertEquals(expResult, result);
       
    }
	@Test
    public void testMin_Array2() {
        System.out.println("Min_Array");
        int  a[] = new int[] {1,2,-3,4,5};        
        int expResult = -3;
        int result = Bttuan4.Min_Array(a);
        assertEquals(expResult, result);
       
    }
	@Test
    public void testMin_Array3() {
        System.out.println("Min_Array");
        int  a[] = new int[] {1,2,3,4,-5};        
        int expResult = -5;
        int result = Bttuan4.Min_Array(a);
        assertEquals(expResult, result);
       
    }
	@Test
    public void testMin_Array4() {
        System.out.println("Min_Array");
        int  a[] = new int[] {100,2,3,4,5,6};        
        int expResult = 2;
        int result = Bttuan4.Min_Array(a);
        assertEquals(expResult, result);
       
    }
    /**
     * Test of BMI_Test method, of class Bttuan4.
     */
    @Test
    public void testBMI_Test0() {
        System.out.println("BMI_Test");
        float w = 50.0F;
        float h = 1.65F;
        Bttuan4 instance = new Bttuan4();
        String expResult = "thieu can";
        String result = Bttuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
        
    }
	@Test
    public void testBMI_Test1() {
        System.out.println("BMI_Test");
        float w = 120.0F;
        float h = 1.65F;
        Bttuan4 instance = new Bttuan4();
        String expResult = "beo phi";
        String result = Bttuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
        
    }
	@Test
	public void testBMI_Test2() {
        System.out.println("BMI_Test");
        float w = 55.0F;
        float h = 1.65F;
        Bttuan4 instance = new Bttuan4();
        String expResult = "binh thuong";
        String result = Bttuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI_Test3() {
        System.out.println("BMI_Test");
        float w = 100.0F;
        float h = 1.7F;
        Bttuan4 instance = new Bttuan4();
        String expResult = "beo phi";
        String result = Bttuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
        
    }
     @Test
        public void testBMI_Test4() {
        System.out.println("BMI_Test");
        float w = 130.0F;
        float h = 1.7F;
        Bttuan4 instance = new Bttuan4();
        String expResult = "beo phi";
        String result = Bttuan4.BMI_Test(w, h);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class Bttuan4.
     */
  
    
}
