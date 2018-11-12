/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author 123456789
 */
public class ExpressionTest {
    public static void main(String[] args){
        // TODO code application logic here
        try{
        Numeral number0 = new Numeral(0);
        Numeral number1 = new Numeral(1);
        Numeral number2 = new Numeral(2);
        Numeral number3 = new Numeral(3);
        Numeral number10 = new Numeral(10);
        System.out.println("Result : "+(new Square(new Addition(new Subtraction(new Square(number10), number1), new Multiplication(number2, number3)))) +"="+ (new Square(new Addition(new Subtraction(new Square(number10), number1), new Multiplication(number2, number3)))).evaluate());
        Division divByZero = new Division(number1,number0);
            System.out.println(divByZero.evaluate());
        }
        catch(java.lang.ArithmeticException e){
            System.out.println(e);
        }
    }
}
