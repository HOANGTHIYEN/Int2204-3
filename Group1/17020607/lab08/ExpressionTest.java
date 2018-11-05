package week8;

public class ExpressionTest {

    public static void main(String[] args) {
        Square sq = new Square(new Numeral(10)); // 10 x 10
        Subtraction subt = new Subtraction(new Numeral(0), new Numeral(1)); // 0 - 1
        Multiplication mult = new Multiplication(new Numeral(2), new Numeral(3)); // + 2 x 3
        Addition add = new Addition(sq, new Addition(subt, mult)); //10 x 10 + 0 - 1 + 2 x 3
        Square sq1 = new Square(add); //(10 x 10 - 1 + 2 x 3)^2
        System.out.println("Test 1 ");
        System.out.print("Square: ");
        System.out.println(sq.toString());
        System.out.print("Subtraction: ");
        System.out.println(subt.toString());
        System.out.print("Multiple: ");
        System.out.println(mult.toString());
        System.out.print("Addition: ");
        System.out.println(add.toString());
        System.out.print("Expression: ");
        System.out.print(sq1.toString(add) + " = ");
        System.out.println(sq1.evaluate());
        System.out.print("\n");
        
        
        System.out.println("Test 2");
        try {
            Division div = new Division(new Numeral(100), new Numeral(1));
            System.out.print("Division: ");
            System.out.print(div.toString() + " = ");
            System.out.println(div.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0");
        }
    }
}
