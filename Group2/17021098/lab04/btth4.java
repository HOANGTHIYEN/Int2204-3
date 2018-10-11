/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btth4;

public class Btth4 {
    public static int Max(int a,int b){
        if(a>=b)
            return a;
        else
            return b;
    }
    public static int Min(int[] arr){
		int min = arr[0];
		for(int i = 1;i < arr.length;i ++)
			if(arr[i] < min)
				min = arr[i];
		return min;
	}
    public static String BMI(double weight, double high) {
		double bmi = weight/(high*high);
		if(bmi < 18.5)
			return "Thieu can";
		else if( bmi>=18.5&&bmi <23)
			return "Binh thuong";
		else if(bmi>=23&&bmi <25)
			return "Thua can";
                else return "Beo phi";
	}
}