package week8;

public class Square extends Expression {

    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression exp) {
        this.expression = expression;
    }

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    @Override
    public String toString() {
        return expression.toString() + "^2";
    }
    public String toString(Expression expression){
        return "(" + expression.toString() + ")^2";
    }
}
