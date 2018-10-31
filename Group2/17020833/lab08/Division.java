package community.com;

public class Division  extends BinaryExpression {

	Expression left ,right;

	public Division() {
		super();
	}

	public Division(Expression left, Expression right) {
		super();
		this.left = left;
		this.right = right;
	}

	@Override
	public Expression left() {
		// TODO Auto-generated method stub
		return  left ;
	}

	@Override
	public Expression right() {
		// TODO Auto-generated method stub
		return right ;
	}
	 @Override
	    public int evaluate() {
	        try {
	            return (left.evaluate() / right.evaluate());
	        } catch (ArithmeticException e){
	            System.out.println("loi"+e +" loi chia cho 0 ");
	            return -2;
	        }
	    }



	   

	    @Override
	    public String toString() {
	        return left.toString() + " /" + right.toString();
	    }
	}


	
