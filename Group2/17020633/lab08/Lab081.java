/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08.pkg1;

/**
 *
 * @author Dell
 */
public class Lab081 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          System.out.println(new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)),new Multiplication(new Numeral(2), new Numeral(3)))));
          System.out.println(new Square(new Addition(new Subtraction( new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());
        try {
            System.out.println(new Division(new Numeral(1), new Numeral(0)).evaluate());
        }
        catch (ArithmeticException e)
        {
            System.out.println( "Xay ra loi");
        }
    }
    
}
