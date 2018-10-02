/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author nguyen ngoc gioi
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int gtln(int a, int b){
        if(a>=b) return a;
        else return b;
    }
    public static int gtnn(int arr[], int n){
        int min =arr[0];
        for(int i=1; i<n; i++){
            if(min>arr[i]) min = arr[i];
        }return min;
    }public static String BMI(double canNang, double chieuCao){
        double bmi = canNang/(chieuCao*chieuCao);
        if(bmi<18.5)
            return "Thieu can";
        else if(bmi>=18.5&& bmi<23)
            return "Binh thuong";
        else if(bmi>=23 && bmi<25)
            return "Thua can";
        else
            return "Beo phi";
//        else return "";
        
    }

}
