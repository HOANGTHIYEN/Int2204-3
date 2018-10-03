/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Genius
 */
public class Lab04Test {
    
    public Lab04Test() {
    }

    /**
     * Test of timMax̣̣̣̣̣̣̣̣̣ method, of class Lab04.
     */
    @Test
    public void testTimMax() {
        assertEquals(3, Lab04.timMax(2, 3));
    }
    @Test
    public void testTimMax1() {
        assertEquals(4, Lab04.timMax(4, 1));
    }
    @Test
    public void testTimMax2() {
        assertEquals(5, Lab04.timMax(5, 5));
    }
    @Test
    public void testTimMax3() {
        assertEquals(0, Lab04.timMax(0, -3));
    }
    @Test
    public void testTimMax4() {
        assertEquals(-2, Lab04.timMax(-2, -5));
    }
    /**
     * Test of timMin method, of class Lab04.
     */
    @Test
    public void testTimMin() {
        int[] arr = {1, 3, 4, 6, 8, 12};
        assertEquals(1, Lab04.timMin(arr));
    }
     @Test
    public void testTimMin1() {
        int[] arr1 = {5, -5, -5 , -5};
        assertEquals(-5, Lab04.timMin(arr1));
    }
     @Test
    public void testTimMin2() {
        int[] arr2 = {0};
        assertEquals(0, Lab04.timMin(arr2));;
    }
     @Test
    public void testTimMin3() {
        int[] arr3 = {0, -4};
        assertEquals(-4, Lab04.timMin(arr3));
    }
     @Test
    public void testTimMin4() {
        int[] arr4 = {1, 1, 1, -1};
        assertEquals(-1, Lab04.timMin(arr4));
    }

    /**
     * Test of bmi method, of class Lab04.
     */
    @Test
    public void testBmi() {
        assertEquals("Thieu can", Lab04.bmi(45, 1.65));
    }
    @Test
    public void testBmi1() {
        assertEquals("Binh thuong", Lab04.bmi(51.73875, 1.50));
    }
    @Test
    public void testBmi2() {
        assertEquals("Thua can", Lab04.bmi(70, 1.70));
    }
    @Test
    public void testBmi3() {
        assertEquals("Beo phi", Lab04.bmi(100, 1.75));
    }
    @Test
    public void testBmi4() {
        assertEquals("Thieu can", Lab04.bmi(50, 1.65));
    }
    
}