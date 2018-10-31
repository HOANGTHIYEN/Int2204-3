/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thangl8;

import sun.audio.AudioDevice;

/**
 *
 * @author thang
 */
public class lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ArithmeticException{
      try{
        
        Numeral num = new Numeral(10);
        Numeral num1 = new Numeral(2);
        Numeral num2=new Numeral(1);
        Numeral num3=new Numeral(3);
        Numeral num4=new Numeral(0);
        
         
        
        Numeral result = new Numeral(new Square(new Addtion(new Subtraction(new Square(num), num2), new Multiplication(num3, num1))).evaluate());
          System.out.println(result.evaluate());
          System.out.println(new Square(new Addtion(new Subtraction(new Square(num), num2), new Multiplication(num3, num1))));
        Division div=new Division(num, num4);
          System.out.println(div.evaluate());
    }
     
             catch(java.lang.ArithmeticException e){
                System.err.println(e);
                }
        
        
    }

    
}
