/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

 
public class Lab04Test {
    
    public Lab04Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

     
    @Test
    public void testSolonnhat() {
        System.out.println("solonnhat");
        
        int a=0;
        int b=1;
        int expResult=1;
        int result=Lab04.solonnhat(a, b);
        assertEquals(expResult,result);
        
        
    }
    @Test
    public void testSolonnhat1() {
        System.out.println("solonnhat");
        
        int a=0;
        int b=11;
        int expResult=11;
        int result=Lab04.solonnhat(a, b);
        assertEquals(expResult,result);
        
        
    }
     @Test
    public void testSolonnhat2() {
        System.out.println("solonnhat");
        
        int a=20;
        int b=21;
        int expResult=21;
        int result=Lab04.solonnhat(a, b);
        assertEquals(expResult,result);
        
        
    }
     @Test
    public void testSolonnhat3() {
        System.out.println("solonnhat");
        
        int a=10;
        int b=11;
        int expResult=11;
        int result=Lab04.solonnhat(a, b);
        assertEquals(expResult,result);
        
        
    }
      @Test
    public void testSolonnhat4() {
        System.out.println("solonnhat");
        
        int a=8;
        int b=9;
        int expResult=9;
        int result=Lab04.solonnhat(a, b);
        assertEquals(expResult,result);
        
        
    }
    /**
     * Test of sonhonhat method, of class Lab04.
     */
    @Test
    public void testsonhonhat() {
        System.out.println("sonhonhat");
        
         int[] arr={0,1,2,3,4};
         assertEquals(0,Lab04.sonhonhat(arr));
        
        
    }
          @Test
    public void testsonhonhat1() {
        System.out.println("sonhonhat");
        
         int[] arr={3,2,4,1 ,5};
         assertEquals(1,Lab04.sonhonhat(arr));
        
        
    }
         @Test
    public void testsonhonhat2() {
        System.out.println("sonhonhat");
        
         int[] arr={8,7,9};
         assertEquals(7,Lab04.sonhonhat(arr));
        
        
    }
     @Test
    public void testsonhonhat3() {
        System.out.println("sonhonhat");
        
         int[] arr={9,8,0, 10};
         assertEquals(0,Lab04.sonhonhat(arr));
        
        
    }
     @Test
    public void testsonhonhat4() {
        System.out.println("sonhonhat");
        
         int[] arr={5,6,7};
         assertEquals(5,Lab04.sonhonhat(arr));
        
        
    }
         
         
          

     
    @Test
    public void testTinhtrang() {
        System.out.println("tinhtrang");
         
     
      
        assertEquals("beo phi", Lab04.tinhtrang(1.50f,110.1f));
          
    }
     
    @Test
    public void testTinhtrang1() {
        System.out.println("tinhtrang");
         
     
      
        assertEquals("thieu can", Lab04.tinhtrang(1.50f,10.1f));
          
    }
     
    @Test
    public void testTinhtrang2() {
        System.out.println("tinhtrang");
         
     
      
        assertEquals("beo phi", Lab04.tinhtrang(1.50f,120.1f));
          
    }
     
    @Test
    public void testTinhtrang3() {
        System.out.println("tinhtrang");
         
     
           assertEquals("beo phi", Lab04.tinhtrang(1.50f,130.1f));
          
    }
     
    @Test
    public void testTinhtrang4() {
        System.out.println("tinhtrang");
         
     
      
        assertEquals("binh thuong", Lab04.tinhtrang(1.62f,50.8f));
          
    }
    
}
