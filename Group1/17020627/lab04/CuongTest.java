package cuong;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class CuongTest {
    
    @Test
    public void MaxInt1() {
        int temp=500;
        int temp0= Cuong.MaxInt(100, 500);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void MaxInt2() {
        int temp=54;
        int temp0=Cuong.MaxInt(54, 1);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void MaxInt3() {
        int temp=999;
        int temp0=Cuong.MaxInt(999, 500);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void MaxInt4() {
        int temp=23;
        int temp0=Cuong.MaxInt(22, 23);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void MaxInt5() {
        int temp=14;
        int temp0=Cuong.MaxInt(14, 11);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void minArr1() {
        int A[] = new int[] {1,2,3,4};
        int temp=1;
        int temp0=Cuong.minArr(A, 4);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void minArr2() {
        int A[] = new int[] {4,7,2,5,9,6};
        int temp=2;
        int temp0=Cuong.minArr(A, 6);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void minArr3() {
        int A[] = new int[] {14,16,28,11,40};
        int temp=11;
        int temp0=Cuong.minArr(A, 5);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void minArr4() {
        int A[] = new int[] {102,57,305,577,243,4};
        int temp=4;
        int temp0=Cuong.minArr(A, 6);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void minArr5() {
        int A[] = new int[] {111,999};
        int temp=111;
        int temp0=Cuong.minArr(A, 2);
        assertEquals(temp, temp0);
    }

    @Test
    public void testBMI1() {
        String temp="Thieu can";
        String temp0=Cuong.BMI(50, 1.7);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void testBMI2() {
        String temp="Binh thuong";
        String temp0=Cuong.BMI(60.5, 1.7);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void testBMI3() {
        String temp="Thua can";
        String temp0=Cuong.BMI(55, 1.51);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void testBMI4() {
        String temp="Beo phi";
        String temp0=Cuong.BMI(65, 1.5);
        assertEquals(temp, temp0);
    }
    
    @Test
    public void testBMI5() {
        String temp="Binh thuong";
        String temp0=Cuong.BMI(62, 1.8);
        assertEquals(temp, temp0);
    }

}