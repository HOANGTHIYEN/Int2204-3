package Lap08;

public class ExpressionTest {

    public static void main(String args[]) {

        Expression n1 = new Numeral(3); //3
        Expression s1 = new Square(n1); //3^2
        Expression n2 = new Numeral(1); //1
        Expression a1 = new Addition(s1, n2); //3^2 + 1
        Expression s2 = new Square(a1); // (3^2 + 1)^2
        Expression m1 = new Multiplication(n1,s1);
        Expression sub1 = new Subtraction(m1,s2);
        Expression d1 = new Division(n1,n2);

        System.out.println(n1);
        System.out.println(s1);
        System.out.println(n2);
        System.out.println(a1);
        System.out.println(s2);
        System.out.println(s2.evaluate());
        System.out.println(m1);
        System.out.println(sub1.evaluate());
        System.out.println(d1.evaluate());
    }
}
