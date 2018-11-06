package lap8_1;

public class Square extends Expression {
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }

    @Override
    public String toString() {
        if(expression instanceof Numeral)
            return expression.toString()+"^2";
            else
             return "("+expression.toString()+")"+"^2";
    }
}
