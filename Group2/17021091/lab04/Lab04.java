/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Genius
 */
public class Lab04 {

    /**
     * @param args the command line arguments
     */
    public static int timMax(int a, int b){
        if(a > b)
            return a;
        return b;
    }
    public static int timMin(int[] arr){
        int min = arr[0];
        for(int i = 1;i < arr.length;i ++)
            if(arr[i] < min)
                min = arr[i];
        return min;
    }
    public static String bmi(double cn, double cc){
        double bmi = cn/(cc*cc);
        if(bmi < 18.5)
            return "Thieu can";
        else if(bmi < 23)
            return "Binh thuong";
        else if(bmi < 25)
            return "Thua can";
        else
            return "Beo phi";
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}