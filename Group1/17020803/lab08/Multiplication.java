package Ex1;

public class Multiplication extends BinaryExpression {
    
    public Multiplication(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public String toString() {
        return "("+left+")*("+right+")";
    }
   
    @Override
    public int evaluate() {
        return left.evaluate() * right.evaluate();
    }
}
