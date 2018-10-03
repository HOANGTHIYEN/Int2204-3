package com.company;

import org.junit.Test;

import static com.company.Main.BMI;
import static com.company.Main.minnGroup;
import static com.company.Main.mmax;
import static org.junit.Assert.*;

public class MainTest {
    //Tests of mmax
    @Test
    public void max() {
        assertEquals(4, mmax(4, 2), 0.0);
    }

    @Test
    public void isNotMax() {
        assertNotEquals(2, mmax(2, 4), 0.0);
    }

    @Test
    public void min() {
        assertFalse(2 == mmax(2, 4));
    }

    @Test
    public void isNotMin() { assertEquals(4,mmax(4,2), 0.0); }

    @Test
    public void arrIsNotNull() {
        assertNotNull(new double[]{2, 4});
    }

    //Tests of minnGroup
    @Test
    public void minGroup() {
        double[] arr = {3, 4, 5, 6, 7, 8};
        assertEquals(3, minnGroup(arr), 0.0);
    }

    @Test
    public void isNotMinGroup() {
        double[] arr = {3, 4, 5, 6, 7, 8};
        assertNotEquals(4, minnGroup(arr), 0.0);
    }

    @Test
    public void minGroup2() {
        double[] arr = {12, 14, 15, 16, 17, 18};
        assertEquals(12, minnGroup(arr), 0.0);
    }

    @Test
    public void minGroup3() {
        double[] arr = {22, 24, 25, 26, 27, 28};
        assertEquals(22, minnGroup(arr), 0.0);
    }

    @Test
    public void minGroup4() {
        double[] arr = {42, 44, 45, 46, 47, 48};
        assertEquals(42, minnGroup(arr), 0.0);
    }

    // Tests of BMI
    @Test
    public void BMIthieuCan() {
        assertEquals("Thieu can", BMI(1, 2));
    }

    @Test
    public void BMIbinhThuong() {
        assertEquals("Binh thuong", BMI(5000, 15));
    }

    @Test
    public void BMIthuaCan() {
        assertEquals("Thua can", BMI(5500, 15));
    }

    @Test
    public void BMIbeoPhi() {
        assertEquals("Beo phi", BMI(8000, 15));
    }

    @Test
    public void isNotBeoPhi() {
        assertFalse("Beo phi" == BMI(5500, 15));
    }
}