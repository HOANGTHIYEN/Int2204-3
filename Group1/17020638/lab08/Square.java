package lab8;

public class Square extends Expression {
    Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }

    @Override
    int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }
    
    @Override
    public String toString() {
        return "("+expression.toString() + "^2"+")";
    }
}
