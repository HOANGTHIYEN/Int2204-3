/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

/**
 *
 * @author Admin
 */
public class Arithmetic {
    public static void main(String[] args) {
        try
        {
            System.err.println(5/0);
        }
        catch(java.lang.ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
