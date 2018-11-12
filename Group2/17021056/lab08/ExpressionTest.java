/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Administrator
 */
public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Numeral number0 = new Numeral(0);
        Numeral number1 = new Numeral(1);
        Numeral number2 = new Numeral(2);
        Numeral number3 = new Numeral(3);
        Numeral number10 = new Numeral(10);
        Square pow1 = new Square(number10);
        Multiplication multi1= new Multiplication(number2, number3);
        Subtraction sub1= new Subtraction(pow1, number1);
        Addtion tong1= new  Addtion(sub1, multi1);
        Square pow2 = new Square(tong1);
        System.out.println(pow2.toString()+" = " +pow2.evaluate());
        try{  Numeral number11 = new Numeral(0);
                Numeral number12 = new Numeral(1);
                Division dv1= new Division(number12, number11);
                System.out.println(dv1.evaluate());
        }
        catch(Exception e)
        {  String s="dasd";
       }
    }

    
}
