
package tuan8;


public class ExpressionTest {

	public static void main(String[] args) {
		//(10*10 - 1 + 2*3) * (10*10 - 1 + 2*3)
	System.out.print(
		new Square( 
		new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)), 
		             new Multiplication(new Numeral(2), new Numeral(3)))).toString()+" = ");
        
        System.out.println(
		new Square( 
		new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)), 
		             new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());
        
          
        //Lỗi chia cho 0!!
        try{
            Division division = new Division(new Numeral(5), new Numeral(0));
            System.out.println(division.evaluate());
             }
        catch (ArithmeticException e){
            System.out.println("Lỗi chia cho 0!");
           }
         
 }
        
}
