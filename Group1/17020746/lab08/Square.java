package lb8;

public class Square extends Expression {
    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Square(Expression expression){
        this.expression = expression;
    }

    public int evaluate(){
        return expression.evaluate()*expression.evaluate();
    }

    public String toString(){
        return (expression.toString() + "^2");
    }

    public String toString(Expression expression){
        return "(" + expression.toString() + ")^2";
    }
}
