/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bttuan4;

/**
 *
 * @author thang
 */


public class Bttuan4 {

    public static int Max_int(int a, int b){
        if (a>b) return a;
        return b;
    }
    public static int Min_Array(int a[]){
        int Min_Temp=a[0];
        for (int i=1; i<a.length;i++){
            if (Min_Temp > a[i]) Min_Temp=a[i];
        }
        return Min_Temp;
    }
     public static String BMI_Test(float w,float h){
        float Temp=w/(h*h);
        if(Temp<18.5) return "thieu can";
        if(Temp<23) return "binh thuong";
        if(Temp<25) return "thua can";
        return "beo phi";
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
