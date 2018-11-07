package expression;

public class ExpressionTest extends Exception{
	public static void main(String[] args)  {
		Expression a1 = new Numeral(10);
		Expression a2 = new Numeral(1);
		Expression a3 = new Numeral(2);
		Expression a4 = new Numeral(3);
		Expression s1 = new Square(a1);
		Expression s2 = new Subtraction(s1, a2);
		Expression s3 = new Multiplication(a3, a4);
		Expression s4 = new Addition(s2, s3);
		Expression s5 = new Square(s4);
		
		System.out.println(s5.evaluate());
		System.out.println(s5.toString());
		
		Expression a = new Numeral();
		Expression b = new Numeral(40);
		try {
			Expression sol = new Division(b, a);
			System.out.println(sol.evaluate());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi chia cho so 0");
		}
		
	}
}
