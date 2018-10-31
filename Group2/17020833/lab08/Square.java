package community.com;

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
		// TODO Auto-generated method stub
		return "("+expression.toString()+")"+"^2";
	}

   
 
	

}
