public class Square extends Expression {
    public Expression expression;

    public Expression getExpression(){
        return expression;
    }
    public void setExpression(Expression expression){
        this.expression = expression;
    }

    public Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public int evaluate(){
        return expression.evaluate() * expression.evaluate();
    }
    @Override
    public String toString() {
        return "(" + expression.toString() + ")" + "^2" ;
    }
}
