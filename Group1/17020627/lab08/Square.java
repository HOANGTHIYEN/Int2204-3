package tuan8;

public class Square extends Expression{
    Expression ex;

    public Square(Expression ex) {
        this.ex = ex;
    }
    
    @Override
    public int evaluate(){
        return ex.evaluate()*ex.evaluate();
    }

    @Override
    public String toString() {
    	return "("+ ex.toString()+")^2";
    }
}
