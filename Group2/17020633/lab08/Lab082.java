/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08.pkg2;

/**
 *
 * @author Dell
 */
public class Lab082 {

     public int division(int a,int b) throws ArithmeticException
    {   return a/b;
    }
    public static void main(String[] args) {
         try {
            System.out.println(new Lab082().division(1, 0));
        } catch (ArithmeticException e) {
            System.out.println("khong thuc hien duoc phep chia cho 0 ");
        }
    }
    
}
