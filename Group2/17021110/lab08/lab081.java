/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 *
 */
 abstract class Expression {

    @Override
    public abstract String toString();
    public abstract int evaluate();
}
 abstract class BinaryExpression extends Expression{
    public abstract Expression left();
    public abstract Expression right();
}
 class Square extends Expression{
    Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
   public String toString() {
          return expression.toString() +"^2";
            
    }
    

    @Override
    public int evaluate() {
        return (this.expression.evaluate())*(this.expression.evaluate());
    }
    
}
class Numeral extends Expression {
    int value;
    
    //constructor
    public Numeral() {
    }

    public Numeral(int value) {
        this.value = value;
    }
    
    //getter setter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
           return Integer.toString(value);
    }


    @Override
    public int evaluate() {
        return value;
    }
    
}
class Addition extends BinaryExpression{
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
            return (left.toString()+"+"+right.toString());
    }
    
    @Override
    public int evaluate() {
        return this.left.evaluate()+this.right.evaluate();
    }
    
}
class Multiplication extends BinaryExpression{
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
        return (left.toString()+"*"+right.toString());
    }

    @Override
    public int evaluate() {
        return this.left.evaluate()*this.right.evaluate();
    }

}
 class Subtraction extends BinaryExpression{
    Expression left, right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public int evaluate() {
        return (left.evaluate() - right.evaluate());
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }
    @Override
    public String toString() {
        return left.toString() + "-" + right.toString();
    }
}
 class Division extends BinaryExpression{
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
         return(left.toString()+"/"+right.toString());
    }

    @Override
    public int evaluate() {
        return this.left.evaluate()/this.right.evaluate();
    }
    
}

public class ExpressionTest {

    /**
     * 
     */
    public static void main(String[] args) {
  
        System.out.println((10*10 - 1 + 2*3)*(10*10 - 1 + 2*3));
         System.out.println(new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))).evaluate());
        System.out.println(new Square(new Addition(new Subtraction(new Square(new Numeral(10)), new Numeral(1)), new Multiplication(new Numeral(2), new Numeral(3)))));
       //chia cho 0
        try {
            System.out.println(new Division(new Numeral(2), new Numeral(0)).evaluate());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
}