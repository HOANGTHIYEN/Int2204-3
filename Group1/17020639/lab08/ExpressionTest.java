package JavaApplication8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExpressionTest {

	public static void main(String[] args) {
                System.out.print(
		new Square( 
                    new Addition(
			new Subtraction(
                            new Square(new Numeral(10)), new Numeral(1)), 
				new Multiplication(new Numeral(2), new Numeral(3)))).toString()+"=");
		System.out.println(
		new Square( 
                    new Addition(
			new Subtraction(
                            new Square(new Numeral(10)), new Numeral(1)), 
				new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());				
               	
			
                try{
                            Division d=new Division(new Numeral(10),new Numeral(0));
                            System.out.println(d.evaluate());
                          
                }catch(ArithmeticException e){
                            System.out.println("Lỗi : Divided by zero!!!");
                        }
                try{
                    String a=null;
                    System.out.println(a.length());
                }
                catch(NullPointerException e)
                {
                    System.out.println("Lỗi : "+e);
                }
                
                try{
                    int num[]=new int[3];
                    System.out.println(num[4]);
                }
                catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Lỗi : "+e);
                }
                 try{
                    Object i = 5;
                    i = (String) i;
                }
                catch(ClassCastException e)
                {
                    System.out.println("Lỗi : "+e);
                }
                 try{
                    FileInputStream a=new FileInputStream("afbjafjafb jag");
                }
                catch(FileNotFoundException e)
                {
                    System.out.println("Lỗi : "+e);
                    
                }
	}
        
}
