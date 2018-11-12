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
public class ExpressionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Numberal n1=new Numberal(10);
        Numberal n3=new Numberal(1);
        Numberal n4=new Numberal(2);
        Numberal n5=new Numberal(3);
        Square sq=new Square(n1);
        Multiplication mul1=new Multiplication(n4,n5);
        Subtraction sb2=new Subtraction(sq,n3);
        Addition add1=new Addition(sb2, mul1);
        Square sq2=new Square(add1);
        System.out.println(sq2.toString()+" = "+sq2.evaluate());
        
     
      
      try{
        Numberal num1 = new Numberal(2);
         Numberal num2 = new Numberal(0);
        Division s=new  Division(num1, num2);
        System.out.println(s.evaluate());
    }
     
             catch(java.lang.ArithmeticException e){
            System.out.println("K chia duoc cho 0");
        }
        
        
    }

    
}