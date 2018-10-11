/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab04;

/**
 *
 * @author Administrator
 */
public class Lab04 {
    public static int TimMax(int a,int b)
    {   if(a>=b)
            return a;
        else
            return b;
    }
    public static int TimMin(int a[])
    {   int Min=a[0];
        for(int i=0;i<a.length;i++)
        {   if(a[i]<Min)
                Min=a[i]; 
        }
       return Min;
    }
    public static  String ChisoBMI(float a,float b)
    {   float bmi;
        bmi=a/(b*b);
        if(bmi<18.5)
        {   return "Thieu Can"; }
        else if(bmi>=18.5 && bmi<=22.99)
        {   return "Binh Thuong";
        }
        else if(bmi>23 && bmi<=24.99)
        {   return "Thua can";
        }
        else 
            return "Beo Phi";
    }
}