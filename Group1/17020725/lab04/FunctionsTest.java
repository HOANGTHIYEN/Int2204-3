/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class FunctionsTest {
    
    public FunctionsTest() {
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
     * Test of max method, of class Function.
     */
    @Test
    public void testMax1() {
        System.out.println("max");
        int a = 3;
        int b = 5;
        int expResult = 5;
        int result = Functions.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax2() {
        System.out.println("max");
        int a = 100;
        int b = 101;
        int expResult = 100;
        int result = Functions.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax3() {
        System.out.println("max");
        int a = -15;
        int b = -10;
        int expResult = -10;
        int result = Functions.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax4() {
        System.out.println("max");
        int a = 1000;
        int b = 1000;
        int expResult = 1001;
        int result = Functions.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMax5() {
        System.out.println("max");
        int a = 1;
        int b = 0;
        int expResult = 1;
        int result = Functions.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of minOfArray method, of class Function.
     */
    @Test
    public void testMinOfArray1() {
        System.out.println("minOfArray");
        int[] arr = new int[] {0,1,2,3,4,5,6};
        int expResult = 0;
        int result = Functions.minOfArray(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinOfArray2() {
        System.out.println("minOfArray");
        int[] arr = new int[] {0,1,2,3,4,5,6};
        int expResult = 3;
        int result = Functions.minOfArray(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinOfArray3() {
        System.out.println("minOfArray");
        int[] arr = new int[] {0,1,2,3,4,5,6};
        int expResult = 6;
        int result = Functions.minOfArray(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinOfArray4() {
        System.out.println("minOfArray");
        int[] arr = new int[] {0,0,0,0,0,0,0,0};
        int expResult = 100;
        int result = Functions.minOfArray(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testMinOfArray5() {
        System.out.println("minOfArray");
        int[] arr = new int[] {-5,-4,-3,-2,-1,0};
        int expResult = -5;
        int result = Functions.minOfArray(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of BMI method, of class Function.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double weight = 60;
        double height = 1.5;
        String expResult = "Béo phì";
        String result = Functions.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double weight = 55;
        double height = 1.5;
        String expResult = "Thừa cân";
        String result = Functions.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double weight = 70;
        double height = 1.8;
        String expResult = "Thiếu cân";
        String result = Functions.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double weight = 45;
        double height = 1.6;
        String expResult = "Bình thường";
        String result = Functions.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testBM5() {
        System.out.println("BMI");
        double weight = 55;
        double height = 1.52;
        String expResult = "Bình thường";
        String result = Functions.BMI(weight, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of max method, of class Function.
     */
    
}
