package lab8;

public class ExpressionTest {

    public static void main(String args[]) {

        Expression num10 = new Numeral(10); //10
        Expression sqrt1 = new Square(num10); //10^2
        Expression num1 = new Numeral(1); //1
        Expression sub1 = new Subtraction(sqrt1, num1); //10^2 - 1
        Expression num2 = new Numeral(2); // 2
        Expression num3 = new Numeral(3); // 3
        Expression mul1 = new Multiplication(num2,num3); //2*3
        Expression add1 = new Addition(sub1,mul1); //10^2 - 1 + 2*3
        Expression sqrt2 = new Square(add1); //(10^2 - 1 + 2*3)^2
        Expression num5 = new Numeral(5); //5
        Expression div1 = new Division(sqrt2,num5); //((10^2 - 1 + 2*3)^2 )/5
        
        System.out.print(div1+" = ");
        System.out.println(div1.evaluate());
        
    }
}
