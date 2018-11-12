public class ExpressionTest {
    public static void main(String[] arg){
        Expression expre1 = new Numeral(10);
        Expression expre2 = new Numeral(1);
        Expression squa1 = new Square(expre1);
        Expression squa2 = new Square(expre2);
        Expression expre = new Addition(new Division(squa1, squa2), squa1);
        System.out.println(expre.toString() + "=" + expre.evaluate() );

        /*
            (10*2-1+2^3)*2
         */
//        Expression expression1 = new Addition(expre1, expre1);
//        Expression expression2 = new Addition(expression1, expre2);
//        Expression expression3 = new Addition(new Addition(expre3, expre3), expre3);
//        Expression value = new Addition(expression2, expression3);
//        Expression result = new Addition(new Addition(new Addition(new Addition(expre1, expre1), expre2), expression3),new Addition(new Addition(new Addition(expre1, expre1), expre2), expression3));
//
//        Expression ex = new Multiplication(new Addition(new Subtraction(new Multiplication(expre1, expre1), expre4), new Multiplication(new Multiplication(expre3, expre3), expre3)), new Addition(new Subtraction(new Multiplication(expre1, expre1), expre4), new Multiplication(new Multiplication(expre3, expre3), expre3)));
//        System.out.println(new Addition(value, value).evaluate());
//        System.out.println(result.evaluate());
//        System.out.println(ex.evaluate());

//        try{
//            System.out.println( 10 / 0);
//        }
//        catch(ArithmeticException err){
//            System.out.println("Lỗi chia cho 0");
//            System.out.println(err);
//        }
    }
}
