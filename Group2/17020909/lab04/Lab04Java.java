/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04.java;

/**
 *
 * @author CCNE
 */
public class Lab04Java {

    //Ham tim gia tri lon nhat cua hai so nguyen
    public static int findMaxInt(int a, int b) {
        int temp=0;
        if (a>b) 
            temp=a;
        else if (b>a) 
            temp=b;
    return temp;
    }
    
    //Ham tim gia tri nho nhat cua mang
    public static int findMinA(int A[], int n) {
        int Min=A[0];
        for (int i=1;i<n;i++)
            if (A[i]<Min) Min=A[i];
        return Min;
    }
    
    //Ham tinh chi so BMI
    public static void BMI(float Wei, float Hei) {
        String S1="Thieu can", S2="Binh thuong", S3="Thua can", S4="Beo phi",S="";
        float temp;
        temp=Wei/(Hei*Hei);
        if (temp<18.5) S=S1;
        else if (temp<22.99) S=S2;
        else if (temp<24.99) S=S3;
        else if (temp>=25) S=S4;
        System.out.printf(S);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
