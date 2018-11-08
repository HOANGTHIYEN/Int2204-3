package JavaWeek8;

public class ExpressionTest {

	public static void main(String[] args) {
		// (10*10 - 1 + 2*3) * (10*10 - 1 + 2*3)
		System.out.println(
				new Square( 
						new Addition(
								new Subtraction(
										new Square(new Numeral(10)), new Numeral(1)), 
								new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());				

	
		System.out.println(
				new Square( 
						new Addition(
								new Subtraction(
										new Square(new Numeral(10)), new Numeral(1)), 
								new Multiplication(new Numeral(2), new Numeral(3)))).toString());				
		
		
		
		try {
			System.out.println(new Division(new Numeral(10), new Numeral(0)).evaluate());
		}catch(ArithmeticException ae) {
			System.out.println("Đây là lỗi chia cho 0: " + ae);
		}
		
		
	}
}
