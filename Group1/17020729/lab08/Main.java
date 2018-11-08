package week008;
        
import java.io.IOException;

class Main{
public static void main(String[] args) {
Expression s1 = new Numeral(10);
Expression s2 = new Numeral(-1);
Expression s3 = new Numeral(2*3);
Expression s4 = new Addition(new Addition(new Square(s1), s2), s3);
Expression s5 = new Square(s4);
//System.out.println(s5.evaluate());
 System.out.println("("+ s1.toString()+"^2" +s2.toString()+"+2*3"+")^2 = "+s5.evaluate());

//test ArrayIndexOutOfBoundsException 
try {
ExpressionTest.array();
}catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}

//test ArithmeticException
try
{
ExpressionTest.split();
}catch(ArithmeticException e1)
{
System.out.println(e1);
}

//test NullPointerException
try {
ExpressionTest.Null();

}catch(NullPointerException e2)
{
System.out.println(e2);
}

//test ClassCastException
try {
ExpressionTest.cast();

}catch(ClassCastException e3)
{
System.out.println(e3);
}

//test IOException
try {
ExpressionTest.File();

}catch(IOException e3)
{
System.out.println(e3);
}	



}
}