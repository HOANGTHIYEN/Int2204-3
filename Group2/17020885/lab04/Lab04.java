/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;
import java.util.*;
/**
 *
 * @author Dell
 */
public class Lab04 {
    public static int max(int a,int b){
        
        
        
        if(a>b){
            return a;
        }
        else 
        return b;
    }
    public static int min(int a[]){
        
        int min = a[0];
        for(int i=0;i<a.length;i++)
            if(a[i]<min)
                min=a[i];
        return min;
       
    }
    
    public static String danhgiaBMI(float cannang,float chieucao){
        float BMI=(cannang/(chieucao*chieucao));
        if(BMI<18.5)
            return "Thiếu cân";
        else if(BMI<23)
            return "Bình thường";
        else if(BMI<=25)
            return "Thừa cân";
        else return "Béo phì";
     }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
    }
    
}
