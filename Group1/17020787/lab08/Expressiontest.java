package lap8_1;

public class Expressiontest {
    public static void main (String[] args ) {
        Numeral num1 = new Numeral(10);
        Numeral num2 = new Numeral(1);
        Numeral num3 = new Numeral(0);
        Numeral num4 = new Numeral(3);
        Square square = new Square(num1);
        Subtraction subtraction = new Subtraction(square, num2);
        Multiplication mutil = new Multiplication(num3, num4);
        Addtition add = new Addtition(subtraction, mutil);
        Square kq=new Square(add);

        System.out.println(kq.evaluate());
        System.out.println(kq.toString());
        Division division=new Division(num1,num3);
        System.out.println(division.evaluate());
    }



}
