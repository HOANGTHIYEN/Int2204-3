/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Dell
 */
public class Lab04 {
    public static int solonnhat(int a,int b)
    {
        if(a==b)
            return a;
        else if(a>b)
            return a;
        else 
            return b;
    }

     public static int sonhonhat(int[] arr)
   {
       int min=arr[0];
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]<=min)
           {
               min=arr[i];
           }
       }
       return min;
   }
      public   static String  tinhtrang(float chieucao,float cannang)
     {
         float bmi=cannang/(chieucao*chieucao);
         if(bmi<18.5)
             return "thieu can";
         else if(bmi>=18.5&&bmi<23)
              return "binh thuong";
         else if(bmi>=23&&bmi<25)
             return "thua can";
         else 
         return "beo phi";}
    
}
