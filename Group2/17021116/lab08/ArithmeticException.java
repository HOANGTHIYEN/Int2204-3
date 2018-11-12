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
public class ArithmeticException {
    public static void main(String[] args){
        // TODO code application logic here
        try{
            System.out.println(1/0);
        }
        catch (java.lang.ArithmeticException e){
            System.out.println(e);
        }
    }
}
