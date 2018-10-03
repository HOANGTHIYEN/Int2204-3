package lab04;

import java.util.Arrays;

public class Lab04 {
    
    
    //Tim GTLN cua 2 so nguyen
    public static int GTLN (int a, int b)
    {
         return Math.max(a, b);
    }
    //Tim GTNN cua 1 mang so nguyen kich thuoc <= 100 phan tu
    public static int GTNN (int arr[])
    {
        Arrays.sort(arr);
        return arr[0];
    }
    public static String BMI(double canNang, double chieuCao)
    {
        double bmi =  canNang / (chieuCao * chieuCao);
        if (bmi < 18.5)
        {
            return ("Thieu can");
        }
        else if (bmi >= 18.5 && bmi < 23)
        {
            return ("Binh thuong");
        }
        else if (bmi >= 23 && bmi < 24.99)
        {
           return "Thua can";
        }
        return "Beo phi";
    }
                
    }
    
