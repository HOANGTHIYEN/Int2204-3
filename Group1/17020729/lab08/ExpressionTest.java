package week008;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
public class ExpressionTest {

//ham throws ArrayIndexOutOfBoundsException 
public static void array() throws ArrayIndexOutOfBoundsException 
{
int[] arr= {1,0};
System.out.println(arr[3]);

}

//ham throws ArithmeticException
public static void split() throws ArithmeticException
{
int a= 10/0;
System.out.println(a);

}

//ham throws NullPointerException
@SuppressWarnings("null")
public static void Null() throws NullPointerException
{
String n=null;
System.out.println(n.length());

}

//ham throws ClassCastException
public static void cast() throws ClassCastException
{
Object x = 0;
System.out.println((String)x);

}

//ham throws FileNotFoundException + IOExeption

@SuppressWarnings({ "resource"})
public static void File() throws IOException
{
BufferedReader br = null;
br = new BufferedReader(new FileReader("C:\\file.txt"));

String line = br.readLine();

while (line != null) {
System.out.println(line);
}

}
}
