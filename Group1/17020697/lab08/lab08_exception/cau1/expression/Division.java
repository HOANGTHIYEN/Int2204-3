package expression;

public class Division extends BinaryExpression{
	private Expression left;
	private Expression right;

	public void setRight(Expression right) {
		this.right = right;
	}
	
	//constructor
	public Division(Expression l, Expression r) {
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
		String tmp="";
		if(this.left instanceof Numeral) {
			tmp = tmp + this.left.toString();
		} else { 
			tmp = tmp + "(" + this.left.toString() + ") ";
		}
		tmp = tmp + "/ ";
		if(this.right instanceof Numeral) {
			tmp = tmp + this.right.toString();
		} else {
			tmp = tmp + "(" + this.left.toString() + ") ";
		}
		return tmp;
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
		
		return tmpl / tmpr;
	}
	//Set/Get
	public void setLeft(Expression left) {
		this.left = left;
	}
}
