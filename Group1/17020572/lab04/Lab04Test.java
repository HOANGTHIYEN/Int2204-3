/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class Lab04Test {
    
    public Lab04Test() {
    }
    
    @Before
    public void setUp() {   
        //temp = new Lab04();
    }
    
    @After
    public void tearDown() {
        //temp = null;
    }

    @Test
    public void testMain() {
        
    }

    @Test
    public void greaterNum1() {
        assertEquals(3, Lab04.greaterNum(2, 3));
    }
    @Test
    public void greaterNum2() {
        assertEquals(4,Lab04.greaterNum(3,4));
    }
    @Test
    public void greaterNum3() {
        assertEquals(27,Lab04.greaterNum(27,12));
    }
    @Test
    public void greaterNum4() {
        assertEquals(12,Lab04.greaterNum(12,3));
    }
    @Test
    public void greaterNum5() {
        assertEquals(99,Lab04.greaterNum(2,99));
    }

    @Test
    public void minArr1() {
        int arr1[] = {0,1,2,3,4,5,6,7,8,9};
        assertEquals(0,Lab04.minArr(arr1));
    }
    @Test
    public void minArr2() {
        int arr2[] = {3,4,99};
        assertEquals(3,Lab04.minArr(arr2));
    }
    @Test
    public void minArr3() {
        int arr3[] = {27,12,99};
        assertEquals(12,Lab04.minArr(arr3));
    }
    @Test
    public void minArr4() {
        int arr4[] = {15,6,18};
        assertEquals(6,Lab04.minArr(arr4));
    }
    @Test
    public void minArr5() {
        int arr5[] = {1,2,3,45,354,3556,45345,345};
        assertEquals(1,Lab04.minArr(arr5));
    }

    @Test
    public void BMI1() {
        assertEquals("Thua Can",Lab04.BMI(1.68,66));
    }
    @Test
    public void BMI2() {
        assertEquals("Thieu Can",Lab04.BMI(1.54,42));
    }
    @Test
    public void BMI3() {
        assertEquals("Beo Phi",Lab04.BMI(1.67,80));
    }
    @Test
    public void BMI4() {
        assertEquals("Binh Thuong",Lab04.BMI(1.55,45));
    }
    @Test
    public void BMI5() {
        assertEquals("Thieu Can",Lab04.BMI(1.77,50));
    }
    
}
