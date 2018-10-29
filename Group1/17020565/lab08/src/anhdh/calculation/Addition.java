package anhdh.calculation;

import anhdh.BinaryExpression;
import anhdh.Expression;

public class Addition extends BinaryExpression {
    private Expression left;
    private Expression right;

    //Constructor
    public Addition(){}

    //getter, setter
    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getLeft() throws  NullPointerException{
        if(left == null) throw  new NullPointerException();
        return left;
    }

    public Expression getRight() {
        if(left == null) throw  new NullPointerException();
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    public Addition(Expression exp1, Expression exp2){
        this.left = exp1;
        this.right = exp2;
    }
    public void setExpression(Expression exp1, Expression exp2){
        this.left = exp1;
        this.right = exp2;
    }

    @Override
    public Expression right() throws  NullPointerException{
        if (right == null) throw new NullPointerException();
        return right;
    }

    @Override
    public Expression left()  throws  NullPointerException{
        if (left == null) throw new NullPointerException();
        return left;
    }

    @Override
    public String toString() {
        return  left.toString() + "+" + right.toString();
    }

    @Override
    public int evaluate()  throws  NullPointerException{
        checkNull();
        return left().evaluate()+right().evaluate();
    }

    private  void checkNull()throws  NullPointerException{
        if (left == null) throw new NullPointerException();
        if (right == null) throw new NullPointerException();
    }
}

