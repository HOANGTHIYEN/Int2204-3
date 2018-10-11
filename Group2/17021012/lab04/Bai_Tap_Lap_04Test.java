/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap_04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nguyễn Thái
 */
public class Bai_Tap_Lap_04Test {
    
    public Bai_Tap_Lap_04Test() {
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
     * Test of Max2Num method, of class Bai_Tap_Lap_04.
     */
    @Test
    public void testMax2Num1() {
        System.out.println("Max2Num");
        int num1 = 9;
        int num2 = 7;
        int expResult = 9;
        int result1 = Bai_Tap_Lap_04.Max2Num(num1, num2);
        assertEquals(expResult, result1);
    }
    @Test
    public void testMax2Num2() {
        int result2 = Bai_Tap_Lap_04.Max2Num(55, 32);
        assertEquals(55, result2);
    }
    @Test
    public void testMax2Num3() {
        
        int result3 = Bai_Tap_Lap_04.Max2Num(28, 13);
        assertEquals(28, result3);
    }

    @Test
    public void testMax2Num4() {
        int result4 = Bai_Tap_Lap_04.Max2Num(13, 18);
        assertEquals(18, result4);
    }
    @Test
    public void testMax2Num5() {
       int result5 = Bai_Tap_Lap_04.Max2Num(27, 5);
        assertEquals(27, result5);
    }
    

    /**
     * Test of MinArr method, of class BaiTapLab004.
     */
    @Test
    public void testMinArr1() {
        System.out.println("MinArr");
        int[] arr1 = {5,3,7,9,4};
        int expResult = 3;
        int result = Bai_Tap_Lap_04.MinArr(arr1);
        assertEquals(expResult, result);
    }
    @Test
    public void testMinArr2() {
        int[] arr2 = {3,20,5,13,43};
        int result2 = Bai_Tap_Lap_04.MinArr(arr2);
        assertEquals(3, result2);
    }
    @Test
    public void testMinArr3() {
        int[] arr3 = {3,11,2,9,4};
        int result3 = Bai_Tap_Lap_04.MinArr(arr3);
        assertEquals(2, result3);
    }
    @Test
    public void testMinArr4() {
        int[] arr4 = {5,31,8,34,4};
        int result4 = Bai_Tap_Lap_04.MinArr(arr4);
        assertEquals(4, result4);
    }
    @Test
    public void testMinArr5() {
        int[] arr5 = {27,13,67,9,40};
        int result5 = Bai_Tap_Lap_04.MinArr(arr5);
        assertEquals(9, result5);
    }

    /**
     * Test of KetQuaBMI method, of class BaiTapLab004.
     */
    @Test
    public void testKetQuaBMI1() {
        System.out.println("KetQuaBMI");
        float M = 66.5F;
        float H = 1.75F;
        String expResult = "Bình thường";
        String result1 = Bai_Tap_Lap_04.KetQuaBMI(M, H);
        assertEquals(expResult, result1);
    }
    @Test
    public void testKetQuaBMI2() {
        String result2 = Bai_Tap_Lap_04.KetQuaBMI(50.5f, 1.67f);
        assertEquals("Thiếu cân", result2);
    }
    @Test
    public void testKetQuaBMI3() {
        String result3 = Bai_Tap_Lap_04.KetQuaBMI(46.5f, 1.57f);
        assertEquals("Bình thường", result3);
    }
    @Test
    public void testKetQuaBMI4() {
        String result4 = Bai_Tap_Lap_04.KetQuaBMI(90.5f, 1.52f);
        assertEquals("Béo phì", result4);
    }
    @Test
    public void testKetQuaBMI5() {
        String result5 = Bai_Tap_Lap_04.KetQuaBMI(80.5f , 1.83f);
        assertEquals("Thừa cân", result5);
    }
    
}
