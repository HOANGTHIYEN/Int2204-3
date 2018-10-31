public class Square extends Expression{
    Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public String toString() {
        return expression.evaluate() + "";
    }

    @Override
    public int evaluate() {
        return expression.evaluate();
    }
}
