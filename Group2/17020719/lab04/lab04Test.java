import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class lab04Test {
    @Test
    public void max1(){
        int m1 = lab04.max(20, 25);
        assertEquals(25, m1);
    }
    @Test
    public void max2(){
        int m2 = lab04.max(1, 2);
        assertEquals(2, m2);
    }
    @Test
    public void max3(){
        int m3 = lab04.max(97, 99);
        assertEquals(99, m3);
    }
    @Test
    public void max4(){
        int m4 = lab04.max(7, 20);
        assertEquals(20, m4);
    }
    @Test
    public void max5(){
        int m5 = lab04.max(1, 7);
        assertEquals(7, m5);
    }

    @Test
    public void arrayMin1(){
        int[] arr1 = {12, 15, 20, 27};
        int m1 = lab04.arrayMin(arr1);
        assertEquals(12, m1);
    }
    @Test
    public void arrayMin2(){
        int[] arr2 = {12, 1, 1, 6};
        int m2 = lab04.arrayMin(arr2);
        assertEquals(1, m2);
    }
    @Test
    public void arrayMin3(){
        int[] arr3 = {67, 71, 99, 105};
        int m3 = lab04.arrayMin(arr3);
        assertEquals(67, m3);
    }
    @Test
    public void arrayMin4(){
        int[] arr4 = {7, 2, 4, 1};
        int m4 = lab04.arrayMin(arr4);
        assertEquals(1, m4);
    }
    @Test
    public void arrayMin5(){
        int[] arr5 = {2, 12, 20, 32};
        int m5 = lab04.arrayMin(arr5);
        assertEquals(2, m5);
    }

    @Test
    public void BMI1(){
        String i1 = lab04.BMI(49.0, 1.62);
        assertEquals("Bình thường", i1);
    }
    @Test
    public void BMI2(){
        String i2 = lab04.BMI(65.0, 1.76);
        assertEquals("Bình thường", i2);
    }
    @Test
    public void BMI3(){
        String i3 = lab04.BMI(52.0, 1.50);
        assertEquals("Thừa cân", i3);
    }
    @Test
    public void BMI4(){
        String i4 = lab04.BMI(48.0, 1.62);
        assertEquals("Thiếu cân", i4);
    }
    @Test
    public void BMI5(){
        String i5 = lab04.BMI(80.0, 1.50);
        assertEquals("Béo phì", i5);
    }
}