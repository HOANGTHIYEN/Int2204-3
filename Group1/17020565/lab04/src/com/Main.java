package com;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Main {
    private final double DELTA = 1e-15;
    public static void main(String[] args) {
    }

    /*@Test
    public void testGetResult() {
        NumberOfBmi n1 = new NumberOfBmi(1.66, 52);
        assertEquals(Bmi.BINH_THUONG.toString(),n1.getResult());

        NumberOfBmi n2 = new NumberOfBmi(1.8, 52);
        assertEquals(Bmi.THIEU_CAN.toString(),n2.getResult());

        NumberOfBmi n3 = new NumberOfBmi(1.66, 80);
        assertEquals(Bmi.BEO_PHI.toString(),n3.getResult());

        NumberOfBmi n4 = new NumberOfBmi(1.66, 65);
        assertEquals(Bmi.THUA_CAN.toString(),n4.getResult());

        NumberOfBmi n5 = new NumberOfBmi(1.62, 50);
        assertEquals(Bmi.BINH_THUONG.toString(),n5.getResult());
    }

    @Test
    public void testGetMax() {
        double num1 = 12.0;
        double num2 = 13.0;
        double num3 = 14.0;
        double num4 = 15.0;
        double num5 = 16.0;
        PracticeA practiceA = new PracticeA();

        assertEquals(num2, practiceA.getMax(num1, num2), DELTA);
        assertEquals(num3, practiceA.getMax(num1, num3), DELTA);
        assertEquals(num4, practiceA.getMax(num1, num4), DELTA);
        assertEquals(num5, practiceA.getMax(num1, num5), DELTA);
        assertEquals(num4, practiceA.getMax(num2, num4), DELTA);
    }

    @Test
    public void testGetMinValue() {
        int numberArr = 10;

        PracticeB p1 = new PracticeB(numberArr);
        assertNotEquals(numberArr, p1.getMinValue());

        PracticeB p2 = new PracticeB(numberArr);
        assertNotEquals(numberArr, p2.getMinValue());

        PracticeB p3 = new PracticeB(numberArr);
        assertNotEquals(numberArr, p3.getMinValue());

        PracticeB p4 = new PracticeB(numberArr);
        assertNotEquals(numberArr, p4.getMinValue());

        PracticeB p5 = new PracticeB(numberArr);
        assertNotEquals(numberArr, p5.getMinValue());
    }*/
}
