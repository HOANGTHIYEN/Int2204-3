/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_04;

/**
 *
 * @author Admin
 */
public class Lap_04 {

    public int gtmax(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
    public int gtminarr(int arr[])
    {
        
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }
    public String BMI(double cn,double cc)
    {
        double bmi;
        bmi=cn/(cc*cc);
        String str = null;
        if(bmi<18.5)
            str="thieu can";
        if(bmi>=18.5&&bmi<23)
            str= "binh thuong";
        if(bmi>=23&&bmi<24.99)
            str="thua can";
        if(bmi>25)
            str="beo phi";
        return str;
    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
