/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap8cau1;

import java.util.InputMismatchException;

/**
 *
 * @author Nguyễn Thái
 */
public class Bai_Tap_Lap8cau1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numerral num1 = new Numerral(10);
         Numerral num2 = new Numerral(1);
         Numerral num3 = new Numerral(2);
         Numerral num4 = new Numerral(3);
         Numerral num5 = new Numerral(0);
         Square res =new Square (new Addition(new Subtraction (new Square(num1),num2),new Multiplication(num3,num4)));
            System.out.println("Gia tri bieu thuc la: " + res.evaluate());
    
        try{
        Division div=new  Division(num1, num5);
        System.out.println(div.evaluate());
    }
            catch(ArithmeticException e){
            System.out.println("Gap su co khi chia so 0"+ e.getMessage());
        }
        
        
    
    }

    @Override
    public String toString() {
        return "Bai_Tap_Lap8cau1{" + '}';
    }
    
}
