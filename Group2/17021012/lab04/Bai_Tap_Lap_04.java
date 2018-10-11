/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap_04;

/**
 *
 * @author Nguyễn Thái
 */
public class Bai_Tap_Lap_04 {

    public static int Max2Num(int num1, int num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    
    public static int MinArr(int []arr){
        int min= arr[0];
        for(int i = 0 ; i<arr.length ; i++)
        {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;     
    }
    
    public static String KetQuaBMI(float M, float H)
    {
         
        float BMI = M/H/H;
        if(BMI < 18.5)
            return "Thiếu cân";
        if (BMI >= 18.5 && BMI < 23)
            return "Bình thường";
        if(BMI >= 23 && BMI <= 24.99)
            return "Thừa cân";
        else
            return "Béo phì";
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}
    
