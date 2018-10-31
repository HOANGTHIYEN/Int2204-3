package lab08;

public class ExpressionTest{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Expression n1 = new Numeral(10);
		Expression S1 = new Square(n1);
		Expression n2 = new Numeral(1);
		Expression S2 = new Subtraction(S1,n2);
		Expression n3 = new Numeral(2);
		Expression n4 = new Numeral(3);
		Expression S3 = new Multiplication(n3,n4);
		Expression S4 = new Addition(S2,S3);
		Expression S5 = new Square(S4);
		System.out.println(S1 +"="+ S1.evaluate());
		System.out.println(S2+"="+S2.evaluate());
		System.out.println(S3 + "=" + S3.evaluate());
		System.out.println(S4 + "=" + S4.evaluate());
		System.out.println(S5+ "=" + S5.evaluate());
		try {
			Expression n5 = new Numeral(0);
			Expression k = new Division(n1,n5);
			System.out.println(k + "=" + k.evaluate());
		}catch(Exception e) {
			System.out.println("Loi chia cho 0");
		}
	}
	


}
