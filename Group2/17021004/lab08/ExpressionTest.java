package lab08;

public class ExpressionTest  {
    public static void main(String[] args) {
        try{
        Numeral number_0 = new Numeral(0);
        Numeral number_1 = new Numeral(1);
        Numeral number_2 = new Numeral(2);
        Numeral number_3 = new Numeral(3);
        Numeral number_10 = new Numeral(10);
        //(10^2 - 1 + 2*3)^2 = 11025
        Square result = new Square(new Addition(new Sutraction(new Square(number_10), number_1), new Multiplication(number_2, number_3)));
        System.out.println(result.toString()+" = "+result.evaluate());
        Division divByZero = new Division(number_1,number_0);
            System.out.println(divByZero.evaluate());
        }
        catch(java.lang.ArithmeticException e){
            System.out.println(e);
        }
    }
}
