/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class BMI {

    /**
     * @param args the command line arguments
     */
    public static String GetBMI(double weight,double height)
    {
        double bmi=weight/(height*height);
        if(bmi < 18.5)
        {
            return"Thieu can";
        }
        else if(bmi>=18.5 && bmi<23) 
        {
            return"Binh thuong";
        }
        else if(bmi>=23 && bmi<=24.99)
        {
            return"Thua can";
        }
        else return"Beo phi";
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        double weight=scanner.nextDouble();
        double height=scanner.nextDouble();
        System.out.println(GetBMI(weight, height));
    }
    
}
