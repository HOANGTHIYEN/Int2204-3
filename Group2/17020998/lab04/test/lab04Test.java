import org.junit.Test;

import static org.junit.Assert.*;


public class lab04Test {
    @Test
    public void test_value_max_1(){
        int result1 = lab04.valueMax(5,10);
        assertEquals(10, result1);
    }

    @Test
    public void test_value_max_2(){
        int result2 = lab04.valueMax(6,7);
        assertEquals(7, result2);

    }

    @Test
    public void test_value_max_3(){
        int result3 = lab04.valueMax(50,61);
        assertEquals(61, result3);
    }

    @Test
    public void test_value_max_4(){
        int result4 = lab04.valueMax(72,90);
        assertEquals(90, result4);
    }

    @Test
    public void test_value_max_5(){
        int result5 = lab04.valueMax(88,94);
        assertEquals(94, result5);
    }


    @Test
    public void test_value_min_of_array_1(){
        int result1 = lab04.valueMinOfArray(new int[]{3, 1, 2, 6, 4, 2});
        assertEquals(1, result1);
    }

    @Test
    public void test_value_min_of_array_2(){
        int result2 = lab04.valueMinOfArray(new int[]{12, 13, 5, 9});
        assertEquals(5, result2);
    }

    @Test
    public void test_value_min_of_array_3(){

        int result3 = lab04.valueMinOfArray(new int[]{50, 12, 60, 90, 100});
        assertEquals(12, result3);
    }

    @Test
    public void test_value_min_of_array_4(){

        int result4 = lab04.valueMinOfArray(new int[]{100, 142, 152, 10, 8});
        assertEquals(8, result4);
    }

    @Test
    public void test_value_min_of_array_5(){

        int result5 = lab04.valueMinOfArray(new int[]{3, 1, 6, 5, 5, 2});
        assertEquals(1, result5);
    }

    @Test
    public void test_BMI_1(){

        String result2 = lab04.BMI(68,1.5f);
        assertEquals("Béo phì", result2);
    }

    @Test
    public void test_BMI_2(){

        String result3 = lab04.BMI(55,1.65f);
        assertEquals("Bình thường", result3);
    }

    @Test
    public void test_BMI_3(){

        String result4 = lab04.BMI(89,1.81f);
        assertEquals("Béo phì", result4);
    }

    @Test
    public void test_BMI_4(){

        String result5 = lab04.BMI(65,1.6f);
        assertEquals("Béo phì", result5);
    }

    @Test
    public void test_BMI_5(){
        String result1 = lab04.BMI(70,1.71f);
        assertEquals("Thừa cân", result1);
    }

}