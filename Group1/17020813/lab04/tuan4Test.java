/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan4Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class tuan4Test {
    
    public tuan4Test() {
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
    public void max1() {
        int av1 = tuan4.max(1, 3);
        assertEquals(3, av1);
    }
    @Test
    public void max2() {
        int av2 = tuan4.max(6 , 4);
        assertEquals(6, av2);
    }
    @Test
    public void max3() {
        int av3 = tuan4.max(-4 ,5);
        assertEquals(5, av3);
    }
    @Test
    public void max4() {
        int av4 = tuan4.max(-20 ,-5);
        assertEquals(-5, av4);
    }
    @Test
    public void max5() {
        int av5 = tuan4.max(200 ,0);
        assertEquals(200, av5);
    }
    @Test
    public void min1() {
        
        int arr1[] ={1};
        int m1 = tuan4.minArr(arr1);
        assertEquals(1, m1);
    }
    @Test
    public void min2() {

        int arr2[] = {-1, 0 };
        int m2 = tuan4.minArr(arr2);
        assertEquals(-1, m2);
    }
    @Test
    public void min3() {

        int arr3[] = {0, 3 , 4 };
        int m3 = tuan4.minArr(arr3);
        assertEquals(0, m3);
    }
    @Test
    public void min4() {
        int arr4[] = {200, 60, 260, 1};
        int m4 = tuan4.minArr(arr4);
        assertEquals(1, m4);
    }
    @Test
    public void min5() {
        int arr5[] = {-10, -5, 0, 5, 10};
        int m5 = tuan4.minArr(arr5);
        assertEquals(-10, m5);
    }
    public void BMI1() {
        String s1 = tuan4.BMI(1.78, 60);
        assertEquals("Bình thường", s1);
    }
    @Test
    public void BMI2() {
        String s2 = tuan4.BMI(1.65, 70);
        assertEquals("Béo phì", s2);
    }
    @Test
    public void BMI3() {
        String s3 = tuan4.BMI(1.8, 50);
        assertEquals("Thiếu cân", s3);
    }
    @Test
    public void BMI4() {
        String s4 = tuan4.BMI(1.6, 62);
        assertEquals("Thừa cân", s4);
    }
    @Test
    public void BMI5() {
        String s5 = tuan4.BMI(1.53, 45);
        assertEquals("Bình thường", s5);
    }
}

    
    

