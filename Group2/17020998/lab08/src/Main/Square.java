package Main;

import static java.lang.Math.pow;

public class Square extends Expression {
    private Expression expression;

    Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public int evaluate(){
        return (int) pow(expression.evaluate(),2);
    }

    @Override
    public String toString() {
        return  "(" + expression.toString() + ")^2";
    }

}
