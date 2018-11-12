package Ex1;


public class ExpressionTest {

    public static void main(String args[]) {

        Expression numeral1 = new Numeral(10);
        Expression square1 = new Square(numeral1);
        Expression numeral2 = new Numeral(1);
        Expression addition1 = new Addition(square1, numeral2);
        Expression square2 = new Square(addition1);

        System.out.print(square2.toString() + " = ");
        System.out.println(square2.evaluate());

        Expression subtraction1 = new Subtraction(square1,numeral2);
        System.out.print(subtraction1.toString() + " = ");
        System.out.println(subtraction1.evaluate());

        Expression multiplication = new Multiplication(addition1,subtraction1);

        System.out.print(multiplication.toString() + " = ");
        System.out.println(multiplication.evaluate());
        try {
            Expression division = new Division(square1,new Numeral(0));
            System.out.print(division.toString() + " = ");
            System.out.println(division.evaluate());
        }
        catch (Exception e)
        {
            if (e instanceof ArithmeticException) System.out.println("Loi chia cho 0");
        }
    }
}
