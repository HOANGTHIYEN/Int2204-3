
package lab8;


public class ExpressionTest {
    public static void main(String[] args) {
        try
        {
            Numeral number0=new Numeral(0);
            Numeral number1=new Numeral(1);
            Numeral number2=new Numeral(2);
            Numeral number3=new Numeral(3);
            Numeral number10=new Numeral(10);
	//tinh gia tri bieu thuc
            Square kq = new Square(new Addition(new Subtraction(new Square(number10), number1), new Multiplication(number2, number3)));
            System.out.println(kq.toString()+" = "+kq.evaluate());
            //chia cho so 0
		Division ChiaSo0 = new Division(number1,number0);
            System.out.println(ChiaSo0.evaluate());
        }
        catch(java.lang.ArithmeticException e){
   	System.out.println("Can not division with zero");
        }
    }
}
