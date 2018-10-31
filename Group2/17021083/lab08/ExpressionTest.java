import java.io.FileNotFoundException;
import java.io.IOException;

public class ExpressionTest {
    public static void main(String args[]) throws NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, ClassCastException, IOException, FileNotFoundException {

        Expression n1 = new Numeral(3); //3
        Expression s1 = new Square(n1); //3^2
        Expression n2 = new Numeral(0); //0
        Expression x1 = new Division(n2, s1);// 3/0
        Expression a1 = new Addition(s1, n2); //3^2 + 1
        Expression s2 = new Square(a1); // (3^2 + 1)^2

        System.out.println(n1.toString());
        System.out.println(s1.toString());
        System.out.println(n2);
        System.out.println(a1.evaluate());
        System.out.println(s2);
        System.out.println(s2.evaluate());

        try {
            int value = x1.evaluate();
            System.out.println(x1.evaluate());
        } catch(ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }
    }

}