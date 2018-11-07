
package lab8;

public class ExpressionTest {
    public static void main(String[] args) {
        System.out.println(
                new Square(new Addition(
                                new Subtraction(new Square(new Numeral(10)), new Numeral(1)),
                                new Multiplication(new Numeral(2), new Numeral(3)))));
        System.out.println(
                new Square(new Addition(
                                new Subtraction(new Square(new Numeral(10)), new Numeral(1)),
                                new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());
        // (10^2-1+2*3)^2 = 11025
        try {
            System.out.println(new Division(new Numeral(2), new Numeral(0)).evaluate());
        }
        catch (ArithmeticException e)
        {
            System.out.println( "lỗi chia cho 0");
        }
    }
}
