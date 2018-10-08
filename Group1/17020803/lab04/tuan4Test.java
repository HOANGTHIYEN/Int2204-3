import org.junit.Test;

import static org.junit.Assert.*;

public class tuan4Test {

    @Test
    public void max1() {
        tuan4 test = new tuan4();
        int av1 = test.max(1, 3);
        assertEquals(3, av1);
    }

    @Test
    public void max2() {
        tuan4 test = new tuan4();
        int av2 = test.max(6 ,2);
        assertEquals(6, av2);
    }

    @Test
    public void max3() {
        tuan4 test = new tuan4();
        int av3 = test.max(-1 ,5);
        assertEquals(5, av3);
    }

    @Test
    public void max4() {
        tuan4 test = new tuan4();
        int av4 = test.max(-16 ,-5);
        assertEquals(-5, av4);
    }

    @Test
    public void max5() {
        tuan4 test = new tuan4();
        int av5 = test.max(100 ,0);
        assertEquals(100, av5);
    }

    @Test
    public void minArr1() {
        tuan4 test = new tuan4();
        int arr1[] ={1, 3 , 5};
        int m1 = test.minArr( arr1);
        assertEquals(1, m1);
    }

    @Test
    public void minArr2() {
        tuan4 test = new tuan4();
        int arr2[] = {-1, 0 };
        int m2 = test.minArr(arr2);
        assertEquals(-1, m2);
    }

    @Test
    public void minArr3() {
        tuan4 test = new tuan4();
        int arr3[] = {0, 1 , 4 };
        int m3 = test.minArr(arr3);
        assertEquals(0, m3);
    }

    @Test
    public void minArr4() {
        tuan4 test = new tuan4();
        int arr4[] = {200, 60, 245, 4};
        int m4 = test.minArr(arr4);
        assertEquals(4, m4);
    }

    @Test
    public void minArr5() {
        tuan4 test = new tuan4();
        int arr5[] = {-10, -5, 0, 5, 10};
        int m5 = test.minArr(arr5);
        assertEquals(-10, m5);
    }

    @Test
    public void BMI1() {
        tuan4 test = new tuan4();
        String s1 = test.BMI(1.78, 60);
        assertEquals("Bình thu?ng", s1);
    }

    @Test
    public void BMI2() {
        tuan4 test = new tuan4();
        String s2 = test.BMI(1.65, 70);
        assertEquals("Béo phì", s2);
    }

    @Test
    public void BMI3() {
        tuan4 test = new tuan4();
        String s3 = test.BMI(1.8, 50);
        assertEquals("Thi?u cân", s3);
    }

    @Test
    public void BMI4() {
        tuan4 test = new tuan4();
        String s4 = test.BMI(1.6, 62);
        assertEquals("Th?a cân", s4);
    }

    @Test
    public void BMI5() {
        tuan4 test = new tuan4();
        String s5 = test.BMI(1.53, 45);
        assertEquals("Bình thu?ng", s5);
    }


}