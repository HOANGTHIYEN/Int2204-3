/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 123456789
 */
public class Week4Test {
    
    public Week4Test() {
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
    public void testMaxNum1() {
        System.out.println("maxNum ");
        assertEquals(2, Week4.maxNum(1, 2));
    }
    @Test
    public void testMaxNum2(){
        assertEquals(9, Week4.maxNum(9, 2));
    }
    @Test
    public void testMaxNum3(){
        assertEquals(120, Week4.maxNum(120, 22));
    }
    @Test
    public void testMaxNum4(){
        assertEquals(1000, Week4.maxNum(1000, 90));
    }
    @Test
    public void testMaxNum5(){
        assertEquals(8, Week4.maxNum(8, 5));
    }
   @Test
    public void testMinArray1() {
        System.out.println("minArray");
        int[] arr1 = {1,2,3,4,5,6};
        int result1 = Week4.minArray(arr1);
        assertEquals(1, result1);
    }
    @Test
    public void testMinArray2() {
        int[] arr2 = {3,5,8,9,10,15,100,20};
        int result2 = Week4.minArray(arr2);
        assertEquals(3, result2);
    }
    @Test
    public void testMinArray3() {
        int[] arr3 = {8,15,60,20,120,65,95,113};
        int result3 = Week4.minArray(arr3);
        assertEquals(8, result3);
    }
    @Test
    public void testMinArray4() {
        int[] arr4 = {120,250,69,15,10,89,96,564,1215};
        int result4 = Week4.minArray(arr4);
        assertEquals(10, result4);
    }
    @Test
    public void testMinArray5() {
        int[] arr5 = {1,18,25,90,60,45,64,82,14};
        int result5 = Week4.minArray(arr5);
        assertEquals(1, result5);
    }
    @Test
    public void testBmi1() {
        System.out.println("bmi");
        assertEquals("Béo phì", Week4.bmi(1.5d, 60d));     
    }
    @Test
    public void testBmi2() {
        assertEquals("Béo phì", Week4.bmi(1.5d, 70d));
    }
    @Test
    public void testBmi3() {
        assertEquals("Thiếu cân", Week4.bmi(1.8d, 50d));
    }
    @Test
    public void testBmi4() {
        assertEquals("Bình thường", Week4.bmi(1.8d, 60d));
    }
    @Test
    public void testBmi5() {
        assertEquals("Thừa cân", Week4.bmi(1.6d, 60d));
    }

}