/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class Btth4Test {
    
    public Btth4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of solon method, of class Btth4.
     */
    @Test
    public void testMax() {
        System.out.println("Max");
        int a = 1;
        int b = 2;
        int expResult = 1;
        int result = Btth4.Max(a, b);
        assertEquals(expResult, result);
     
    }
    @Test
    public void testMax1() {
        System.out.println("Max");
        int a = 2;
        int b = 10;
        int expResult = 10;
        int result = Btth4.Max(a, b);
        assertEquals(expResult, result);
     
    }
    @Test
    public void testMax2() {
        System.out.println("Max");
        int a = 11;
        int b = 23;
        int expResult = 23;
        int result = Btth4.Max(a, b);
        assertEquals(expResult, result);
     
    }
    @Test
    public void testMax3() {
        System.out.println("Max");
        int a = 45;
        int b = 90;
        int expResult = 45;
        int result = Btth4.Max(a, b);
        assertEquals(expResult, result);
     
    }
    @Test
    public void testMax4() {
        System.out.println("Max");
        int a = 15;
        int b = 29;
        int expResult = 15;
        int result = Btth4.Max(a, b);
        assertEquals(expResult, result);
     
    }

    
    @Test
    public void Min() {
        System.out.println("Min");
        int[] arr = {10,20,30};
        int expResult = 0;
        int result = Btth4.Min(arr);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testMin1() {
        System.out.println("Min");
        int[] arr = {11,222,30};
        int expResult = 11;
        int result = Btth4.Min(arr);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testMin2() {
        System.out.println("Min");
        int[] arr = {10,2,300};
        int expResult = 10;
        int result = Btth4.Min(arr);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testMin3() {
        System.out.println("Min");
        int[] arr = {15,207,30};
        int expResult = 15;
        int result = Btth4.Min(arr);
        assertEquals(expResult, result);
       
    }
     @Test
    public void testMin4() {
        System.out.println("Min");
        int[] arr = {15,20,30};
        int expResult = 15;
        int result = Btth4.Min(arr);
        assertEquals(expResult, result);
       
    }

    
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double weight = 50;
        double high = 1.60;
        String expResult = "Binh thuong";
        String result = Btth4.BMI(weight, high);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double weight = 87;
        double high = 1.69;
        String expResult = "Beo phi";
        String result = Btth4.BMI(weight, high);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double weight = 40;
        double high = 1.60;
        String expResult = "Thieu can";
        String result = Btth4.BMI(weight, high);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double weight = 67;
        double high = 1.60;
        String expResult = "Thua can";
        String result = Btth4.BMI(weight, high);
        assertEquals(expResult, result);
      
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double weight = 54;
        double high = 1.60;
        String expResult = "Binh thuong";
        String result = Btth4.BMI(weight, high);
        assertEquals(expResult, result);
      
    }
    
}