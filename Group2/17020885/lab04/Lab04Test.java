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
 * @author Dell
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
     * Test of max method, of class Lab04.
     */
    @Test
    public void testMax() {
       
        int a = 0;
        int b = 0;
        Lab04 instance = new Lab04();
        int expResult = 0;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax1() {
       
        int a = 4;
        int b = 4;
        Lab04 instance = new Lab04();
        int expResult = 4;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMax2() {
       
        int a = 32;
        int b = 543;
        Lab04 instance = new Lab04();
        int expResult = 543;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax3() {
       
        int a = 12;
        int b = 10;
        Lab04 instance = new Lab04();
        int expResult = 12;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax4() {
       
        int a = 7;
        int b = 9;
        Lab04 instance = new Lab04();
        int expResult = 9;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of min method, of class Lab04.
     */
    @Test
    public void testMin() {
        
       int[] a = new int[] {6,5,7};
        int expResult = 5;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMin1() {
        
        int[] a = new int[] {6,5,100,46,5,34};
        int expResult = 5;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMin2() {
        
        int[] a = new int[] {6,2,7,46,5};
        int expResult = 2;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMin3() {
        
        int[] a = new int[] {6,5,7,46,5};
        int expResult = 5;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testMin4() {
        
        int[] a = new int[] {0,1,2,3,4};
        
        int expResult = 0;
        int result = Lab04.min(a);
        assertEquals(expResult, result);
        
    }
    
    
    
    
   

    /**
     * Test of danhgiaBMI method, of class Lab04.
     */
    @Test
    public void testDanhgiaBMI() {
       
        float cannang = 50;
        float chieucao = 1.65F;
        
        String expResult = "Thiếu cân";
        String result =Lab04.danhgiaBMI(cannang, chieucao);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testDanhgiaBMI1() {
        
        float cannang = 55;
        float chieucao = 1.67F;
        
        String expResult = "Bình thường";
        String result = Lab04.danhgiaBMI(cannang, chieucao);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testDanhgiaBMI2() {
        
        float cannang = 67;
        float chieucao = 1.68F;
        
        String expResult = "Thừa cân";
        String result = Lab04.danhgiaBMI(cannang, chieucao);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testDanhgiaBMI3() {
        
        float cannang = 75;
        float chieucao = 1.69F;
        
        String expResult = "Béo phì";
        String result = Lab04.danhgiaBMI(cannang, chieucao);
        assertEquals(expResult, result);
        
    }
    
     @Test
    public void testDanhgiaBMI4() {
        
        float cannang = 80;
        float chieucao = 1.8F;
        
        String expResult = "Thừa cân";
        String result =Lab04.danhgiaBMI(cannang, chieucao);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of main method, of class Lab04.
     */}
