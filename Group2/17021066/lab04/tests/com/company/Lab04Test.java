package com.company;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Lab04Test
{
    @Test

    public void ktratimmax1()//kiểm tra hàm tìm max 2 số nguyên
    {
        Assert.assertEquals(6,Lab04.TimMax(3,6));

    }
    @Test

    public void ktratimmax2()//kiểm tra hàm tìm max 2 số nguyên
    {
        Assert.assertEquals(7,Lab04.TimMax(4,7));

    }
    @Test

    public void ktratimmax3()//kiểm tra hàm tìm max 2 số nguyên
    {
        Assert.assertEquals(8,Lab04.TimMax(5,8));

    }
    @Test

    public void ktratimmax4()//kiểm tra hàm tìm max 2 số nguyên
    {
        Assert.assertEquals(9,Lab04.TimMax(6,9));

    }
    @Test

    public void ktratimmax5()//kiểm tra hàm tìm max 2 số nguyên
    {
        Assert.assertEquals(6,Lab04.TimMax(7,10));

    }




    @Test
    public void ktraminmang1()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints1 = {6,3,8,2,5,9,7,1};
        Assert.assertEquals(1,Lab04.TimMin(ints1));


    }

    @Test
    public void ktraminmang2()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints2 = {1,2,3,4,5};
        Assert.assertEquals(1,Lab04.TimMin(ints2));

    }

    @Test
    public void ktraminmang3()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints3 = {2,3,1,4,5};
        Assert.assertEquals(1,Lab04.TimMin(ints3));

    }
    @Test
    public void ktraminmang4()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints4 = {2,3,4,5,1};
        Assert.assertEquals(1, Lab04.TimMin(ints4));

    }
    @Test
    public void ktraminmang5()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints5 = {6,3,8,25,5,9,7,1};
        Assert.assertEquals(1,Lab04.TimMin(ints5));

    }






    @Test
    public void ktraBMI1()// kiểm tra chỉ số BMI
    {
        Assert.assertEquals("Thieu Can",Lab04.ChisoBMI(41.4f, 1.56f));


    }
    @Test
    public void ktraBMI2()// kiểm tra chỉ số BMI
    {

        Assert.assertEquals("Beo Phi",Lab04.ChisoBMI(100f, 1.50f));

    }
    @Test
    public void ktraBMI3()// kiểm tra chỉ số BMI
    {

        Assert.assertEquals("Binh Thuong",Lab04.ChisoBMI(67f, 1.79f));


    }
    @Test
    public void ktraBMI4()// kiểm tra chỉ số BMI
    {

        Assert.assertEquals("Binh Thuong",Lab04.ChisoBMI(57f, 1.78f));


    }
    @Test
    public void ktraBMI5()// kiểm tra chỉ số BMI
    {

        Assert.assertEquals("Thieu Can",Lab04.ChisoBMI(50f, 1.8f));

    }
}