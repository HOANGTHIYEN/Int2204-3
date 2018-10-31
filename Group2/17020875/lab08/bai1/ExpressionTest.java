package bai1;

class ExpressionTest {
    public static void main(String args[])
    {
        Numeral numeral0 = new Numeral(0);

        Numeral numeral1 = new Numeral(1);
        Numeral numeral2 = new Numeral(2);
        Numeral numeral3 = new Numeral(3);
        Numeral numeral10 = new Numeral(10);


        System.out.println(new Square(new Addition(new Subtraction(new Square(numeral10), numeral1), new Multiplication(numeral2, numeral3))).evaluate());
        System.out.println(new Square(new Addition(new Subtraction(new Square(numeral10), numeral1), new Multiplication(numeral2, numeral3))));

        try
        {
            Division div = new Division(numeral2, numeral0);
            System.out.println(div.evaluate());
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Lỗi chia cho 0");
        }

    }
}
