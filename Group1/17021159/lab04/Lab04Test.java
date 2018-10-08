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
 * @author Admin
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
    public void testMax1() {
        System.out.println("max");
        int a = 3;
        int b = 2;
        int expResult = 3;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testMax2() {
        System.out.println("max");
        int a = -3;
        int b = 5;
        int expResult = 5;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testMax3() {
        System.out.println("max");
        int a = 12;
        int b = 6;
        int expResult = 13;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testMax4() {
        System.out.println("max");
        int a = 10;
        int b = -4;
        int expResult = 10;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testMax5() {
        System.out.println("max");
        int a = 7;
        int b = 41;
        int expResult = 41;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of min_arr method, of class Lab04.
     */
    @Test
    public void testMin_arr1() {
        System.out.println("min_arr");
        int[] arr = {1,2,3,4,5,6};
        int expResult = 1;
        int result = Lab04.min_arr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testMin_arr2() {
        System.out.println("min_arr");
        int[] arr = {12,34,2,5,6};
        int expResult = 2;
        int result = Lab04.min_arr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testMin_arr3() {
        System.out.println("min_arr");
        int[] arr = {9,7,4,13,1,2};
        int expResult = 1;
        int result = Lab04.min_arr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testMin_arr4() {
        System.out.println("min_arr");
        int[] arr = {7,15,8,9,10,3};
        int expResult = 3;
        int result = Lab04.min_arr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testMin_arr5() {
        System.out.println("min_arr");
        int[] arr = {6,28,91,135,4,122};
        int expResult = 4;
        int result = Lab04.min_arr(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        double wei = 82;
        double hei = 1.7;
        String expResult = "béo phì";
        String result = Lab04.BMI(wei, hei);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testBMI2() {
        System.out.println("BMI");
        double wei = 55.0;
        double hei = 1.58;
        String expResult = "bình thường";
        String result = Lab04.BMI(wei, hei);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testBMI3() {
        System.out.println("BMI");
        double wei = 50;
        double hei = 1.58;
        String expResult = "bình thường";
        String result = Lab04.BMI(wei, hei);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testBMI4() {
        System.out.println("BMI");
        double wei = 70.0;
        double hei = 1.6;
        String expResult = "béo phì";
        String result = Lab04.BMI(wei, hei);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    public void testBMI5() {
        System.out.println("BMI");
        double wei = 56;
        double hei = 1.55;
        String expResult = "thừa cân";
        String result = Lab04.BMI(wei, hei);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

