/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lab04Test
{
    @Test

    public void ktratimmax()//kiểm tra hàm tìm max 2 số nguyên
    {
        Lab04 lab = new Lab04();
        Assert.assertEquals(6,lab.TimMax(3,6));
        Assert.assertEquals(2,lab.TimMax(2,1));
    }
    @Test
    public void ktraminmang()//kiểm tra hàm tìm min 1 mảng
    {
        Lab04 lab = new Lab04();
        int[] ints = {6,3,8,2,5,9,7,1};
        Assert.assertEquals(1,lab.TimMin(ints));
    }
    @Test
    public void ktraBMI()// kiểm tra chỉ số BMI
    {
        Lab04 lab = new Lab04();
        Assert.assertEquals("Thiếu cân",lab.ChisoBMI(41.4f, 1.56f));
    }
}
