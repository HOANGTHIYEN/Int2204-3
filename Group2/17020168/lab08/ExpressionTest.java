package lab_08;

public class ExpressionTest {
    public static void main(String[] args) throws  ArithmeticException{
        Numeral num1 = new Numeral(0);
        Numeral num2 = new Numeral(1);
        Numeral num3 = new Numeral(2);
        Numeral num4 = new Numeral(3);
        System.out.println(new Addition(num3,num2).evaluate());
        System.out.println(new Subtraction(num3,num2).evaluate());
        System.out.println(new Multiplication(num3,num2).evaluate());
        System.out.println(new Division(num3,num2).toString());
        System.out.println(new Square(num3).evaluate());
//        try{
//            System.out.println(new  Division(new Numeral(10),new Numeral(0)).toString() +" "+new  Division(new Numeral(10),new Numeral(0)).evaluate());
//        }catch (java.lang.ArithmeticException err){
//            System.out.println(err);
//        }
    }
}
