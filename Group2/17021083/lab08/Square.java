public class Square extends Expression{
    private Expression expression;

    public Square(Expression e) {
        this.expression = e;
    }
    @Override
    public String toString() {
        return expression + "^2";
    }

    @Override
    public int evaluate() {
        return (int) Math.pow(expression.evaluate(), 2);
    }

}
