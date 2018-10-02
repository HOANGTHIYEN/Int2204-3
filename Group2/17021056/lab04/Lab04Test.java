/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class Lab04Test {
    
    
    @Test

    public void TimMax()//kiểm tra hàm tìm max 2 số nguyên
    {
        
        Assert.assertEquals(6,Lab04.TimMax(3,6));
     
        
    }
    
     @Test

    public void TimMax1()//kiểm tra hàm tìm max 2 số nguyên
    {
        
        
        Assert.assertEquals(9,Lab04.TimMax(6,9));
       
 
        
    }
    @Test

    public void TimMax2()//kiểm tra hàm tìm max 2 số nguyên
    {
        
       
        Assert.assertEquals(10,Lab04.TimMax(10,1));
      
 
        
    }
    @Test

    public void TimMax3()//kiểm tra hàm tìm max 2 số nguyên
    {
        
      
        Assert.assertEquals(3,Lab04.TimMax(3,3));
    
 
        
    }
    @Test

    public void TimMax4()//kiểm tra hàm tìm max 2 số nguyên
    {
        
    
        Assert.assertEquals(4,Lab04.TimMax(4,1));
    }
    @Test
    public void ktraminmang()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints = {6,3,8,2,5,9,7,1};
        Assert.assertEquals(1,Lab04.TimMin(ints));
    }
    @Test
    public void ktraminmang1()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints = {6,3,8,2,5,9,7,1};
        Assert.assertEquals(1,Lab04.TimMin(ints));
    }
    @Test
    public void ktraminmang2()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints2 = {7,8,9,5,5,6,3,2};
        Assert.assertEquals(2,Lab04.TimMin(ints2));
    }
    @Test
    public void ktraminmang3()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ints4 = {5,6,48,65,2,3,2,4};
        Assert.assertEquals(2,Lab04.TimMin(ints4));
      
    }
    @Test
    public void ktraminmang4()//kiểm tra hàm tìm min 1 mảng
    {
        int[] ins5 = {1,5,8,7,4,2,3};
        Assert.assertEquals(1,Lab04.TimMin(ins5));
    }
    @Test
    public void ktraBMI()// kiểm tra chỉ số BMI
    {
        
        Assert.assertEquals("Thieu Can",Lab04.ChisoBMI(41.4f, 1.56f));
        
    }
     @Test
    public void ktraBMI1()// kiểm tra chỉ số BMI
    {
        
       
        Assert.assertEquals("Beo Phi",Lab04.ChisoBMI(70.4f, 1.56f));
     
    }
     @Test
    public void ktraBMI2()// kiểm tra chỉ số BMI
    {
        
       
        Assert.assertEquals("Binh Thuong",Lab04.ChisoBMI(64.4f, 1.75f));
        
    }
     @Test
    public void ktraBMI3()// kiểm tra chỉ số BMI
    {
        
       
        Assert.assertEquals("Beo Phi",Lab04.ChisoBMI(65.4f, 1.56f));
       
    }
     @Test
    public void ktraBMI4()// kiểm tra chỉ số BMI
    {
        
        
        Assert.assertEquals("Thua can",Lab04.ChisoBMI(75.f, 1.75f));
    }

}
