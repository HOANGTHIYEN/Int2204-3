/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2lab08;

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
            System.out.println(new Arithmetic().division(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
   
    
}
}
