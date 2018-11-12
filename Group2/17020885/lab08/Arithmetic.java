/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Administrator
 */
public class Arithmetic {
    public int division(int tu,int mau) throws ArithmeticException
    {   return tu/mau;
    }
    public static void main(String[] args){
        try {
            System.out.println(new Arithmetic().division(1, 0));
        } catch (ArithmeticException e) {
            System.out.println("khong thuc hien duoc phep chia cho 0 ");
        }
   
    
}
}

