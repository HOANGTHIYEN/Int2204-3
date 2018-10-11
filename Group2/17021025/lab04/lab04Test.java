package lab04;

import org.junit.Test;

import static org.junit.Assert.*;

public class lab04Test
{
    @Test
    public void testfindmax1()//kiểm tra hàm tìm max 2 số nguyên
    {
        assertEquals(6, lab04.findmax(3, 6));
    }
    @Test
    public void testfindmax2()//kiểm tra hàm tìm max 2 số nguyên
    {
        assertEquals(4, lab04.findmax(4, 1));
    }
    @Test
    public void testfindmax3()//kiểm tra hàm tìm max 2 số nguyên
    {

        assertEquals(7, lab04.findmax(3, 7));
    }
    @Test
    public void testfindmax4()//kiểm tra hàm tìm max 2 số nguyên
    {
        assertEquals(5, lab04.findmax(5, 1));
    }
    @Test
    public void testfindmax5()//kiểm tra hàm tìm max 2 số nguyên
    {
        assertEquals(9, lab04.findmax(6, 9));
    }
    @Test
    public void testminarray1()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints = {6,3,8,2,5,9,7,1};
        assertEquals(1,lab04.minarray(ints));
    }
    @Test
    public void testminarray2()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints = {1,3,5,8,9,4};
        assertEquals(1,lab04.minarray(ints));
    }
    @Test
    public void testminarray3()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints = {7,5,7,3,4,6,2};
        assertEquals(2,lab04.minarray(ints));
    }
    @Test
    public void testminarray4()//kiểm tra hàm tìm min 1 mảng
    {

        int[] ints = {5,9,7,3,2,6,8};
        assertEquals(2,lab04.minarray(ints));
    }
    @Test
    public void testminarray5()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints = {1,2,3,4,5,6,7,8,9};
        assertEquals(1,lab04.minarray(ints));
    }
    @Test
    public void testBMI1()// kiểm tra chỉ số BMI
    {
        assertEquals("Thiếu cân",lab04.BMI(41.4f, 1.56f));
    }
    @Test
    public void testBMI2()// kiểm tra chỉ số BMI
    {
        assertEquals("Bình thường",lab04.BMI(45.7f, 1.56f));
    }
    @Test
    public void testBMI3()// kiểm tra chỉ số BMI
    {

        assertEquals("Thừa cân",lab04.BMI(60.7f, 1.56f));
    }
    @Test
    public void testBMI4()// kiểm tra chỉ số BMI
    {
        assertEquals("Thiếu cân",lab04.BMI(41.4f, 1.56f));
    }
    @Test
    public void testBMI5()// kiểm tra chỉ số BMI
    {
        assertEquals("Béo phì",lab04.BMI(70.6f, 1.56f));
    }
}