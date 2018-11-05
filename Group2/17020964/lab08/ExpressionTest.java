package lab8;

public class ExpressionTest {
	public static void main(String[] args) {
		Expression e1 = new Numeral(10);//10
		Expression e2 = new Numeral(1);//1
		Expression sqr1 = new Square(e1);//10^2
		Expression sub1 = new Subtraction(sqr1, e2);//10^2-1
		Expression mul1 = new Numeral(2);//2
		Expression mul2 = new Numeral(3);//3
		Expression mul = new Multiplication(mul1, mul2);//2*3
		Expression sum = new Addition(sub1, mul);//10^2-1+2*3
		Expression sum2 = new Square(sum);//sum^2
		Expression div = new Numeral(0);
		System.out.println(sqr1.toString()+"="+sqr1.evaluate());
		
		try {
			Expression div1 = new Division(sum2, div);
			System.out.println(div1.evaluate());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("lỗi chia cho 0");
		}
		
		
	}

}
