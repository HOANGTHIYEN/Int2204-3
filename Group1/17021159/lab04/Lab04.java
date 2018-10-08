/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Admin
 */
public class Lab04 {

    public static int max(int a, int b){
        if(a>=b) return a;
        else return b;
    } 
    public static int min_arr(int [] arr){
        int min = arr[0];
        for(int i = 1;i< arr.length; i++){
            if(min > arr[i]) min = arr[i];
        }
        return min;
    }
    public static String BMI(double wei, double hei){
        double BMI = wei/hei*hei;
    
        if(BMI<18.5) return "thiếu cân";
        else if(BMI<23 ) return "bình thường";
            else  if(BMI<25 ) return "thừa cân";
                else return "béo phì";
    }
}
