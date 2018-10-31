package lab8;
public class ExpressionTest {
	public static void main(String[] args) {
		// (10*10 - 1 + 2*3) * (10*10 - 1 + 2*3)
		System.out.println(new Square( new Addition(new Subtraction( new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());
                // (5*3)+8^2-3
                System.out.println(new Subtraction(new Addition(new Multiplication(new Numeral(5),new Numeral(3)),new Square(new Numeral(8))),new Numeral(3)).evaluate());
        }
}
