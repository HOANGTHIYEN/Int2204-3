package lb8;

public class ExpressionTest {
    public static void main(String[] args) {
        try{
            Division division = new Division(new Numeral(5), new Numeral(0));
            System.out.println(division.evaluate());
        }
        catch (ArithmeticException e){
            System.out.println("Lỗi chia cho 0!");
        }
        Square square = new Square(new Numeral(10)); // 10^2
        Multiplication multiplication = new Multiplication(
                new Numeral(2), new Numeral(3)); // 2 x 3
        Subtraction subtraction = new Subtraction(square, new Numeral(1)); // 10^2 - 1
        Addition addition = new Addition(subtraction, multiplication); // 10^2 - 1 + 2 x 3
        Square square1 = new Square(addition); // (10^2 - 1 + 2 x 3)^2

        System.out.println("Subtraction left - right");
        System.out.println("Sub left: " + subtraction.left() + " -- Sub right: " + subtraction.right());
        System.out.println("Sub toString: " + subtraction.toString());
        System.out.println("---------");
        System.out.println("Multiplication left - right");
        System.out.println("Mul left: " + multiplication.left() + " -- Mul right: " + multiplication.right());
        System.out.println("Mul toString: " + multiplication.toString());
        System.out.println("---------");
        System.out.println("Addition left - right");
        System.out.println("Add left: " + addition.left() + " -- Add right: " + addition.right());
        System.out.println("Add toString: " + addition.toString());
        System.out.println("--------------");
        System.out.print("Final: ");
        System.out.println(square1.toString(addition) + " = " + square1.evaluate());


    }
}
