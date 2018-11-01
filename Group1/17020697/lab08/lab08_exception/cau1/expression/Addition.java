package expression;

public class Addition extends BinaryExpression{
	private Expression left;
	private Expression right;

	//Constructor
	public Addition(Expression l, Expression r) {
		left = l;
		right = r;
	}
	
	@Override
	public Expression left() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public Expression right() {
		// TODO Auto-generated method stub
		return right;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.left.toString() +"+ "+ this.right.toString()+" ";
	}

	@Override
	public int evaluate() {
		// TODO Auto-generated method stub
		int tmpl;
		int tmpr;
		
		if(this.left instanceof Numeral) {
			tmpl = ((Numeral) this.left).getValue();
		} else {
			tmpl = this.left.evaluate();
		}
		
		if(this.right instanceof Numeral) {
			tmpr = ((Numeral) this.right).getValue();
		} else {
			tmpr = this.right.evaluate();
		}
		
		return tmpl + tmpr;
	}

	
	//Set/Get
	public void setLeft(Expression left) {
		this.left = left;
	}

	public void setRight(Expression right) {
		this.right = right;
	}

}
