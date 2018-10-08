/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

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
public class Lab04Test {
    
    public Lab04Test() {
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
     * Test of solon method, of class Lab04.
     */
    @Test
    public void testSolon() {
        System.out.println("solon");
        int a = 3;
        int b = 5;
        int expResult = 5;
        int result = Lab04.solon(a, b);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testSolon1() {
        System.out.println("solon");
        int a = 5;
        int b = 5;
        int expResult = 5;
        int result = Lab04.solon(a, b);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testSolon2() {
        System.out.println("solon");
        int a = 100;
        int b = 5;
        int expResult = 10;
        int result = Lab04.solon(a, b);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testSolon3() {
        System.out.println("solon");
        int a = -5;
        int b = 5;
        int expResult = -5;
        int result = Lab04.solon(a, b);
        assertEquals(expResult, result);
       
    }
      @Test
    public void testSolon4() {
        System.out.println("solon");
        int a = 15;
        int b = 5;
        int expResult = 20;
        int result = Lab04.solon(a, b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of searchMin method, of class Lab04.
     */
    @Test
    public void testSearchMin() {
        System.out.println("searchMin");
        int[] arr ={11,2,3};
        int expResult = 2;
        int result = Lab04.searchMin(arr);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testSearchMin1() {
        System.out.println("searchMin");
        int[] arr ={10,22,30};
        int expResult = 10;
        int result = Lab04.searchMin(arr);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testSearchMin2() {
        System.out.println("searchMin");
        int[] arr ={-11,2,31};
        int expResult = 12;
        int result = Lab04.searchMin(arr);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testSearchMin3() {
        System.out.println("searchMin");
        int[] arr ={1,1,3};
        int expResult = 1;
        int result = Lab04.searchMin(arr);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testSearchMin4() {
        System.out.println("searchMin");
        int[] arr ={11,29,33};
        int expResult = 15;
        int result = Lab04.searchMin(arr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void testBMI0() {
        System.out.println("BMI");
        double weight = 70;
        double high = 1.73;
        String expResult = "Binh thuong";
        String result = Lab04.BMI(weight, high);
        assertEquals(expResult, result);
       
    }
    @Test
     public void testBMI1() {
        System.out.println("BMI");
        double weight = 52;
        double high = 1.65;
        String expResult = "Binh thuong";
        String result = Lab04.BMI(weight, high);
        assertEquals(expResult, result);
       
    }
        @Test
      public void testBMI2() {
        System.out.println("BMI");
        double weight = 80;
        double high = 1.60;
        String expResult = "Thua can";
        String result = Lab04.BMI(weight, high);
        assertEquals(expResult, result);
       
    }
         @Test
       public void testBMI3() {
        System.out.println("BMI");
        double weight = 80;
        double high = 1.60;
        String expResult = "Beo phi";
        String result = Lab04.BMI(weight, high);
        assertEquals(expResult, result);
       
    }
          @Test
        public void testBMI4() {
        System.out.println("BMI");
        double weight = 50;
        double high = 1.55;
        String expResult = "Thieu can";
        String result = Lab04.BMI(weight, high);
        assertEquals(expResult, result);
       
    }
      
    
}