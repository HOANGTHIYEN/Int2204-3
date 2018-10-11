import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test {

    @Test
    public void max1() {
        //lab04 maxAB = new lab04();
        assertEquals(2, lab04.max(0,2));
    }
    @Test
    public void max2() {
        //lab04 maxAB = new lab04();
        assertEquals(3, lab04.max(3,2));
    }
    @Test
    public void max3() {
        ////lab04 maxAB = new lab04();
        assertEquals(4, lab04.max(4,3));
    }
    @Test
    public void max4() {
        //lab04 maxAB = new lab04();
        assertEquals(5, lab04.max(5,2));
    }
    public void max5() {
        //lab04 maxAB = new lab04();
        assertEquals(2, lab04.max(1,2));
    }

    @Test
    public void minArray1() {
//        lab04 min = new lab04();
        int[] arr1 = {1, 2, 3};
        assertEquals(1, lab04.minArray(arr1,3));

    }
    @Test
    public void minArray2() {
        //lab04 min = new lab04();
        int[] arr1 = {1, 2, 3};
        assertEquals(1, lab04.minArray(arr1,3));
    }
    @Test
    public void minArray3() {
        //lab04 min = new lab04();
        int[] arr2={3, 4, 5, 2};
        assertEquals(2, lab04.minArray(arr2,4));
    }
    public void minArray4() {
        //lab04 min = new lab04();
        int[] arr3={7, 2, 5};
        assertEquals(2, lab04.minArray(arr3,3));
    }
    @Test
    public void minArray5() {
        //lab04 min = new lab04();
        int[] arr4={0, 6, 3};
        assertEquals(0, lab04.minArray(arr4,3));
    }

    @Test
    public void BMI1() {
        //lab04 bmi = new lab04();
        assertEquals("Thieu can", lab04.BMI(30,1.60));
    }
    @Test
    public void BMI2() {
        //lab04 bmi = new lab04();
        assertEquals("Binh thuong", lab04.BMI(53,1.61));
    }
    @Test
    public void BMI3() {
        //lab04 bmi = new lab04();
        assertEquals("Beo phi", lab04.BMI(70,1.63));
    }
    @Test
    public void BMI4() {
        //lab04 bmi = new lab04();
        assertEquals("Binh thuong", lab04.BMI(60,1.65));
    }
    @Test
    public void BMI5() {
        //lab04 bmi = new lab04();
        assertEquals("Beo phi", lab04.BMI(70,1.50));
    }
}