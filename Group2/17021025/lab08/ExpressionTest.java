public class ExpressionTest {
    public static void main(String[] args) {
        Numeral numeral10 = new Numeral(10);
        Numeral numeral1 = new Numeral(1);
        Numeral numeral2 = new Numeral(2);
        Numeral numeral3 = new Numeral(3);

        System.out.println((10*10 - 1 + 2*3)*(10*10 - 1 + 2*3));

        Square square1 = new Square(numeral10); // 10^2
        Subtraction subtraction = new Subtraction(square1,numeral1); // 10^2 - 1
        Multiplication multiplication = new Multiplication(numeral2,numeral3); // 2*3
        Addition addition = new Addition(subtraction,multiplication); // 10^2 -1 + 2*3
        Square square2 = new Square(addition);//(10*10 - 1 + 2*3)^2
        System.out.println(square2);
        System.out.println(square2.evaluate());

        try {
            Numeral numeral0 = new Numeral(0);
            Numeral numeral5 = new Numeral(5);
            Division division = new Division(numeral5,numeral0);
            System.out.println(division.evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Lỗi khi chia cho 0");
        }
    }
}