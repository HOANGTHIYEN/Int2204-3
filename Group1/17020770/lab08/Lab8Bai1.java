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

class Numeral extends Expression
{
	private int value;

    public Numeral(int value){
        this.value = value;
    }

    public Numeral(){
        this.value = 0;
    }

    @Override
    public String toString() {
        return "Numeral: "+value;
    }

    @Override
    public int evaluate() {
        return value;
    }
}

  class Square extends Expression {
    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Square: "+expression+"^2";
    }

    @Override
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
}

class Addition extends BinaryExpression {
	    private Expression left;
	    private Expression right;

	    public Addition(Expression left, Expression right){
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
	        return "Addition:" +" left= " + left +", right= " + right;

	    }
	    @Override
	    public int evaluate() {
	        return left.evaluate() + right.evaluate();
	    }
	}
 class Subtraction extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Subtraction(Expression left, Expression right){
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
        return "Subtraction: " + "left= " + left +", right= " + right;

    }

    @Override
    public int evaluate() {
        return left.evaluate() - right.evaluate();
    }
}

 class Multiplication extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Multiplication(Expression left, Expression right){
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
        return "Multiplication: " + "left= " + left + ", right= " + right;
    }

    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}

  class Division extends BinaryExpression {
	    private Expression left;
	    private Expression right;

	    public Division(Expression left, Expression right){
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
	        return "Division: " +"left= " + left +", right= " + right;

	    }

	    @Override
	    public int evaluate() {
	        return left.evaluate() / right.evaluate();
	    }
	}

   
public class Lab8Bai1 {

  
    public static void main(String[] args) {
          System.out.println(new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)),new Multiplication(new Numeral(2), new Numeral(3)))));
          System.out.println(new Square(new Addition(new Subtraction( new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());
        try {
            System.out.println(new Division(new Numeral(1), new Numeral(0)).evaluate());
        }
        catch (ArithmeticException e)
        {
            System.out.println( "Lỗi");
        }
    }
    
}