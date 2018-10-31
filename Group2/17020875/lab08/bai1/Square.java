package bai1;

public class Square extends  Expression{

    protected Expression expression;

    public Square()
    {
    }
    public Square(Expression expression)
    {
        this.expression = expression;
    }

     public void setExpression(Expression expression) {
         this.expression = expression;
     }

     public Expression getExpression() {
         return expression;
     }

     @Override
     public String toString() {
         return "(" + expression.toString() + ")" + "^2";
     }

     @Override
     public int evaluate() {
         return getExpression().evaluate() * getExpression().evaluate();
     }
 }
