package Bai1;

abstract class Expression {
    abstract public String toString();       //phương thức ko có trình triển khai(ko đc khởi tạo)
    abstract public int evaluate();
}

class Numeral extends Expression{
    protected int value;

    public Numeral() {
    }

    public Numeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int evaluate() {
        return value;
    }

    public String toString() {
        return Integer.toString(value);
    }
}
class Square extends Expression{
    protected Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    public int evaluate(){
        return expression.evaluate()*expression.evaluate();
    }

    public String toString() {
        return "("+expression+")"+"^2";
    }
}

abstract class BinaryExpression extends Expression{
    abstract public int evaluate();
    abstract public Expression left();
    abstract public Expression right();
}


class Addition extends BinaryExpression{

    protected Expression left, right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int evaluate() {
        return (left.evaluate() + right.evaluate());
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return left.toString() +" + "+ right.toString();
    }
}
class Multiplication extends BinaryExpression{
    protected Expression left, right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int evaluate() {
        return (left.evaluate() * right.evaluate());
    }

    public Expression left() {
        return left;
    }


    public Expression right() {
        return right;
    }

    public String toString() {
        return left.toString() + "*" + right.toString();
    }
}

class Division extends BinaryExpression{
    protected Expression left, right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int evaluate() throws ArithmeticException{                   //throws khai báo 1 ngoại lệ
        if(right.evaluate() == 0)
            throw new ArithmeticException("Lỗi chia cho 0");            //throw ném ra 1 ngoại lệ rõ ràng
        return (left.evaluate() / right.evaluate());
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }

    public String toString() {
        return left.toString() + " / " + right.toString();
    }
}
class Subtraction extends BinaryExpression{
    protected Expression left, right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public int evaluate() {
        return (left.evaluate() - right.evaluate());
    }

    public Expression left() {
        return left;
    }

    public Expression right() {
        return right;
    }

    public String toString() {
        return left.toString() + " - " + right.toString();
    }
}
public class ExpressionTest {
    public static void main(String[] args){

        Numeral num1 = new Numeral(10);
        Numeral num2 = new Numeral(1);
        Numeral num3 = new Numeral(2);
        Numeral num4 = new Numeral(3);
        //biểu thức 1
        Square sq2 = new Square(num1);                          //bình phương của 10
        Multiplication mul = new Multiplication(num3,num4);     //tích của 2 và 3
        Subtraction sub =new Subtraction(sq2,num2);             //hiệu của (10^2) và 1
        Addition add = new Addition(sub,mul);                   //tổng cua (10^2-1) va (2*3)
        Square sq1 = new Square(add);                           //binh phuong bieu thuc
        System.out.println(sq1.toString() + " = " + sq1.evaluate());

        Numeral num5 = new Numeral(3);
        Numeral num6 = new Numeral(0);
        //biểu thức 2
        Division dic = new Division(num5,num6);                 //tích của 5 và 0
        try {
            System.out.println(dic.toString() + " = " + dic.evaluate());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
