package bai1;

public class Addition extends BinaryExpression{
    protected Expression left;
    protected Expression right;

    public Addition(){};

     public Expression getRight() {
         return right;
     }

     public Expression getLeft() {
         return left;
     }

     public void setRight(Expression right) {
         this.right = right;
     }

     public void setLeft(Expression left) {
         this.left = left;
     }
     public Addition(Expression left, Expression right)
     {
         this.left = left;
         this.right = right;

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
         return left().toString()+ "+" + right().toString();
     }

     @Override
     public int evaluate() {
         return left().evaluate() + right().evaluate();
     }
 }
