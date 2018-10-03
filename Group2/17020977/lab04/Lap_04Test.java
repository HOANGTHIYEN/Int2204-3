/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Lap_04Test {
    
    public Lap_04Test() {
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

    @Test
    public void testGtmax() {
        Lap_04 test1=new Lap_04();
        int a1=test1.gtmax(2, 3);
        assertEquals(3, a1);
    }
    @Test
    public void testGtmax1() {
        Lap_04 test1=new Lap_04();
         int a2=test1.gtmax(10, 20);
        assertEquals(20, a2);
    }
    @Test
    public void testGtmax2() {
        Lap_04 test1=new Lap_04();
         int a3=test1.gtmax(9, 10);
        assertEquals(10, a3);
    }
    @Test
         public void testGtmax3() {
        Lap_04 test1=new Lap_04();    
         int a4=test1.gtmax(7, 20);
        assertEquals(20, a4);
         }
    @Test
         public void testGtmax4() {
        Lap_04 test1=new Lap_04();     
         int a5=test1.gtmax(23, 25);
         assertEquals(25, a5);
    }
    @Test
    public void testGtminarr() {
        Lap_04 instance = new Lap_04();
        int arr1[]={1,2,3,4,5};
        int a1=instance.gtminarr(arr1);
        assertEquals(1, a1);
    }
    @Test
    public void testGtminarr1() {
        Lap_04 instance = new Lap_04();
        int arr1[]={5,3,7,5,3,10};
        int a1=instance.gtminarr(arr1);
        assertEquals(3, a1);
    }
     @Test
    public void testGtminarr2() {
        Lap_04 instance = new Lap_04();
        int arr1[]={12,9,6,7};
        int a1=instance.gtminarr(arr1);
        assertEquals(6, a1);
    }
     @Test
    public void testGtminarr3() {
        Lap_04 instance = new Lap_04();
        int arr1[]={7,8,5,11,6};
        int a1=instance.gtminarr(arr1);
        assertEquals(5, a1);
    }
@Test
    public void testGtminarr4() {
        Lap_04 instance = new Lap_04();
        int arr1[]={22,9,4,5,3};
        int a1=instance.gtminarr(arr1);
        assertEquals(3, a1);
    }

    /**
     * Test of BMI method, of class Lap_04.
     */
    
    @Test
    public void testBMI() {
        Lap_04 instance = new Lap_04();
        String c1=instance.BMI(56, 1.7);
        assertEquals("binh thuong", c1);
    }
    @Test
    public void testBMI1() {
        Lap_04 instance = new Lap_04();
        String c1=instance.BMI(50, 1.7);
        assertEquals("thieu can", c1);
    }
    @Test
    public void testBMI2() {
        Lap_04 instance = new Lap_04();
        String c1=instance.BMI(60, 1.6);
        assertEquals("thua can", c1);
    }
    @Test
    public void testBMI3() {
        Lap_04 instance = new Lap_04();
        String c1=instance.BMI(70,1.5);
        assertEquals("beo phi", c1);
    }
    @Test
    public void testBMI4() {
        Lap_04 instance = new Lap_04();
        String c1=instance.BMI(56, 1.7);
        assertEquals("binh thuong", c1);
    }
        // TODO review the generated test code and remove the default call to fail.

}
