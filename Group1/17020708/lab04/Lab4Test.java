/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nguyen ngoc gioi
 */
public class Lab4Test {
    public Lab4Test() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testMain() {
    }
    @Test
    public void testGtln1() {
        assertEquals(3, Lab4.gtln(2,3));
        
        
    }
    @Test
    public void testGtln2() {
        assertEquals(19, Lab4.gtln(-10,19));
        
        
    }
   @Test
    public void testGtln3() {
        assertEquals(25, Lab4.gtln(25,7));
        
        
    }
    @Test
    public void testGtln4() {
        assertEquals(13, Lab4.gtln(4,13));
        
        
    }
    @Test
    public void testGtln5() {
        assertEquals(-2, Lab4.gtln(-2,-10));
        
        
    }

    @Test
    public void testGtnn1() {
        int[] arr = {2,3,4,5,1,6};
        assertEquals(1, Lab4.gtnn(arr, 6));
    }
    @Test
    public void testGtnn2() {
        int[] arr = {2,3,4,5,1,6, 9, 0};
        assertEquals(0, Lab4.gtnn(arr, 8));
    }@Test
    public void testGtnn3() {
        int[] arr = {-10,7, 4, 2,-9,3};
        assertEquals(-10, Lab4.gtnn(arr, 6));
    }@Test
    public void testGtnn4() {
        int[] arr = {4,4,7,7,2,2};
        assertEquals(2, Lab4.gtnn(arr, 6));
    }@Test
    public void testGtnn5() {
        int[] arr = {-5,-4,-4,2 ,3};
        assertEquals(-5, Lab4.gtnn(arr, 5));
    }
    
    @Test
    public void testBMI1(){
       assertEquals("Beo phi", Lab4.BMI(80, 1.54));
    }
    @Test
    public void testBMI2(){
       assertEquals("Thieu can", Lab4.BMI(40, 1.55));
    }
    @Test
    public void testBMI3(){
       assertEquals("Binh thuong", Lab4.BMI(64, 1.68));
    }
    @Test
    public void testBMI4(){
       assertEquals("Thieu can", Lab4.BMI(42, 1.54));
    }
    @Test
    public void testBMI5(){
       assertEquals("Thieu can", Lab4.BMI(40, 1.66));
    }
    

}
