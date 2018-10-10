/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author 123456789
 */

public class Week4 {
    public static int maxNum(int a, int b){
    if(a>=b) return a;
    else return b;
    }
    
    public static int minArray(int[] arr){
        int min = arr[0];
        for(int i=1;i < arr.length;i++){
            if(arr[i]<=min) min = arr[i];
        }
        return min;
    }
    
    public static String bmi(double h, double w){
        double k;
//        k=22.995;
        k = w/(h*h);
        if(k<18.5) return "Thiếu cân";
        else if((k>=18.5)&&(k<23)) return "Bình thường";
        else if((k>=23)&&(k<25)) return "Thừa cân";
        else return "Béo phì";
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        System.out.println(maxNum(10,5));
//        int[] a ={2,3,8,100,15,4,6,9,99,101,94,25};
//        System.out.println(minArray(a));
//        System.out.println(bmi(1.8,58));
//        System.out.println(assertEqauls());
//        
//        // TODO code application logic here
//    }

   
    
}



