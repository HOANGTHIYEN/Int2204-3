/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author admin
 */
public class BMI {
    
    public static String calcuBMI(double height, double weight){
        double BMI;
        String status = null;
        BMI = weight/(height*height);
        if(BMI<18.5)status = "Thieu can";
        if(BMI>=18.5&&BMI<23) status = "Binh thuong" ;
        if(BMI>=23&&BMI<=25) status = "Thua can" ;
        if(BMI>25)status = "Beo phi";
        return status;
    }
    
}
 