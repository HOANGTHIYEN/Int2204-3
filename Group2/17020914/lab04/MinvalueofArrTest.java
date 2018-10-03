/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class MinvalueofArrTest {
   
    @Test
    public void testMinArr1() {
        System.out.println("test_1");
        int expResult = 1;
        int a[] = {1,6,4,8,3,6};
        int result = MinvalueofArr.Min_arr(a);
        assertEquals(expResult,result);   
    }
    @Test
    public void testMinArr2() {
        System.out.println("test_2");
        int expResult = 2;
        int a[] = {8,6,4,8,3,6,56,34,89,232,34,67,34,2,231456,7,12};
        int result = MinvalueofArr.Min_arr(a);
        assertEquals(expResult,result);   
    }
    @Test
    public void testMinArr3() {
        System.out.println("test_3");
        int expResult = 0;
        int a[] = {1,6,4,8,3,6,0,23,6,12,43,65,13,56,23,78,324,56,123};
        int result = MinvalueofArr.Min_arr(a);
        assertEquals(expResult,result);   
    }
    @Test
    public void testMinArr4() {
        System.out.println("test_4");
        int expResult = 4;
        int a[] = {45,6,4,8,12,6,56,78,213,5674123,135,1231456,5756,23,146,4};
        int result = MinvalueofArr.Min_arr(a);
        assertEquals(expResult,result);   
    }
    @Test
    public void testMinArr5() {
        System.out.println("test_5");
        int expResult = 100;
        int a[] = {1324,621,457,82341,33254,6235,423,6547,123,4545,612,243,412,1243,434,3521,234,634,332,523,134,145,432,36231,345,6321,123,413,245,2345,5623,13234,125,100};
        int result = MinvalueofArr.Min_arr(a);
        assertEquals(expResult,result);   
    }
    
}
