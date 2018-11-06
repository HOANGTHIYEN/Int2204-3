package lab08;

abstract class Expression
{
	public abstract String toString();
	public abstract int evaluate();
}

abstract class BinaryExpression extends Expression
{
    abstract public int evaluate();
    abstract public Expression left();
    abstract public Expression right();
}

class Addition extends BinaryExpression
{

    Expression left, right;

    public Addition(Expression left, Expression right) 
    {
        this.left = left;
        this.right = right;
    }
    
    public int evaluate() 
    {
        return (left.evaluate() + right.evaluate());
    }

    public Expression left() 
    {
        return left;
    }

    public Expression right() 
    {
        return right;
    }

    public String toString() 
    {
        return left.toString() + "+" + right.toString();
    }
}

class Subtraction extends BinaryExpression
{

    Expression left, right;

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
        return left.toString() + "-" + right.toString();
    }
}
class Multiplication extends BinaryExpression{

    Expression left, right;

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

    Expression left, right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    public int evaluate() {
        return (left.evaluate() / right.evaluate());
    }

    public Expression left() {
        
        
        return left;
    }

    public Expression right() {
        return right;
    }

    public String toString() {
        return left.toString() + "/" + right.toString();
    }
}
class Numeral extends Expression{
    private int value;

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
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }
    
    public int evaluate(){
        return (expression.evaluate()*expression.evaluate());
    }

    public String toString() {
        if(expression instanceof Numeral)
        	return expression.toString() +"^2";
        else
        	return '(' + expression.toString() +")^2";
    }
}

public class ExpressionTest {

    public static void main(String[] args) {
    	System.out.println(new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))));
        System.out.println(new Square(new Addition(new Addition(new Square(new Numeral(10)), new Numeral(-1)), new Addition(new Numeral(3), new Numeral(3)))).evaluate());
        System.out.println(new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());

        try {
            System.out.println(new Division(new Numeral(20), new Numeral(0)).evaluate());
        } catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0");
        }
    }
}
