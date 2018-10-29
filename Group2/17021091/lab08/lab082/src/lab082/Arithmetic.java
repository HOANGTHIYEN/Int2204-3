/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab082;


/**
 *
 * @author Genius
 */
public class Arithmetic {
    public int Asin(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args){
        try {
            System.out.println(new Arithmetic().Asin(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}   
