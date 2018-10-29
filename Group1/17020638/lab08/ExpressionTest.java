package lab8;

public class ExpressionTest{

    public static void main(String[] args) {
        try {
            
            Square squ = new Square(new Numeral(10));
            Multiplication mul = new Multiplication(new Numeral(2), new Numeral(3));
            Subtraction sub = new Subtraction(squ, new Numeral(1));
            Addition add = new Addition(sub, mul);
            Square sq = new Square(add);
            System.out.println(sq.toString()+" = "+sq.evaluate());
        } catch (ArithmeticException ex) {
            System.out.println("Lỗi chia cho 0");
        }
    }
}
