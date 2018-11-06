/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w8;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Do Tuan Bac
 */
public class ExpressionTest {
    
	public static void main(String[] args) {
            
	Addition ketqua= new Addition(new Division(new Numeral(100), new Numeral(0)) {},new Numeral(10)) {};
        Square ketqua2= new Square(new Division(new Numeral(100), new Numeral(5)) {}) {};
        Subtraction ketqua3= new Subtraction(new Division(new Numeral(100), new Numeral(10)) {},new Numeral(10)) {};
	Square debai= new Square( 
						new Addition(
								new Subtraction(
										new Square(new Numeral(10)), new Numeral(1)) {}, 
								new Multiplication(new Numeral(2), new Numeral(3)) {}) {});
        
        try{
		System.out.println(
                     ketqua.toString()  +" = "+ ketqua.evaluate()
                );
             
               
        }catch(ArithmeticException e)
        {
             System.out.println("Lỗi chia cho 0!");

        }
           System.out.println(
                     ketqua2.toString()  +" = "+ ketqua2.evaluate()
                );
                System.out.println(
                     ketqua3.toString()  +" = "+ ketqua3.evaluate()
                );
                System.out.println(
                     debai.toString()  +" = "+ debai.evaluate()
                );
                                   }
                                   
}
