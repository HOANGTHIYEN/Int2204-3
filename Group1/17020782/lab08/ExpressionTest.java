package lab08;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

abstract class Expression {


public abstract String toString();

public abstract int evaluate();
}

abstract class BinaryExpression extends Expression {

public abstract Expression left();

public abstract Expression right();
}

class Numeral extends Expression {

int value;

public Numeral(int value) {
this.value = value;
}

public Numeral() {

}

@Override
public String toString() {
return " " + value;
}

@Override
public int evaluate() {
return value;
}
}

class Square extends Expression {

Expression expression;

public Square(Expression expression) {
this.expression = expression;
}

@Override
public String toString() {
return "( " + expression + " )" + "^2";
}

@Override
public int evaluate() {
return expression.evaluate() * expression.evaluate();
}
}

class Addition extends BinaryExpression {

Expression left;
Expression right;

public Addition(Expression left, Expression right) {
this.left = left;
this.right = right;
}

@Override
public Expression left() {
return this.left;
}

@Override
public Expression right() {
return this.right;
}

@Override
public String toString() {
return left + " +" + right;

}

@Override
public int evaluate() {
return left.evaluate() + right.evaluate();
}
}

class Subtraction extends BinaryExpression {

Expression left;
Expression right;

public Subtraction(Expression left, Expression right) {
this.left = left;
this.right = right;
}

@Override
public Expression left() {
return this.left;
}

@Override
public Expression right() {
return this.right;
}

@Override
public String toString() {
return left + " -" + right;

}

@Override
public int evaluate() {
return left.evaluate() - right.evaluate();
}
}

class Multiplication extends BinaryExpression {

Expression left;
Expression right;

public Multiplication(Expression left, Expression right) {
this.left = left;
this.right = right;
}

@Override
public Expression left() {
return this.left;
}

@Override
public Expression right() {
return this.right;
}

@Override
public String toString() {
return left + " *" + right;
}

@Override
public int evaluate() {
return left.evaluate() * right.evaluate();
}
}

class Division extends BinaryExpression {

Expression left;
Expression right;

public Division(Expression left, Expression right) {
this.left = left;
this.right = right;
}

@Override
public Expression left() {
return this.left;
}

@Override
public Expression right() {
return this.right;
}

@Override
public String toString() {
return left + " /" + right;

}

@Override
public int evaluate() {
return left.evaluate() / right.evaluate();
}
}

public class ExpressionTest {

//ham throws ArrayIndexOutOfBoundsException 
public static void array() throws ArrayIndexOutOfBoundsException {
int[] arr = {1, 0};
System.out.println(arr[3]);

}

//ham throws ArithmeticException
public static void split() throws ArithmeticException {
int a = 10 / 0;
System.out.println(a);

}

//ham throws NullPointerException
@SuppressWarnings("null")
public static void Null() throws NullPointerException {
String n = null;
System.out.println(n.length());

}

//ham throws ClassCastException
public static void cast() throws ClassCastException {
Object x = new Integer(0);
System.out.println((String) x);

}

//ham throws FileNotFoundException + IOExeption
@SuppressWarnings({"resource"})
public static void File() throws IOException {
BufferedReader br = null;
br = new BufferedReader(new FileReader("C:\\file.txt"));

String line = br.readLine();

while (line != null) {
System.out.println(line);
}

}

public static void main(String[] args) {
Expression s1 = new Numeral(10);
Expression s2 = new Numeral(-1);
Expression s3 = new Numeral(2 * 3);
Expression s4 = new Addition(new Addition(new Square(s1), s2), s3);
Expression s5 = new Square(s4);
System.out.println(s5.toString()+" = "+s5.evaluate());

//test ArrayIndexOutOfBoundsException 
try {
array();
} catch (Exception e) {
System.out.println("mang arr chi co 2 phan tu");
}

//test ArithmeticException
try {
split();
} catch (Exception e1) {
System.out.println("loi chia cho 0");
}

//test NullPointerException
try {
Null();

} catch (Exception e2) {
System.out.println("khong thao tac voi null");
}

//test ClassCastException
try {
cast();

} catch (Exception e3) {
System.out.println("khong the ep kieu");
}

//test IOException
try {
File();

} catch (Exception e3) {
System.out.println("khong doc file duoc");
}

//test FileNotFoundException
try {
File();

} catch (Exception e3) {
System.out.println("sai duong dan");
}

}

}
