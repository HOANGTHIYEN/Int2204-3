package anhdh;

public class Square extends Expression {
    private Expression expression;

    public Square() {
    }

    public Square(Expression expression) {
        this.expression = expression;
    }

    public Expression getExpression()  throws NullPointerException {
        if (expression == null) throw new NullPointerException();
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        if(expression instanceof Numeral){
            return expression.toString() + "^2";
        }else{
            return "(" + expression.toString()+ ")" + "^2" ;
        }

    }

    @Override
    public int evaluate() throws NullPointerException {
        if (expression == null) throw new NullPointerException();
        return getExpression().evaluate() * getExpression().evaluate();
    }

}
