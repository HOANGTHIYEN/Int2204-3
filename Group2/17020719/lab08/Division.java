public class Division extends BinaryExpression {
    public Expression left;
    public Expression right;

    @Override
    public Expression left(){
        return left;
    }
    public void setLeft(Expression left){
        this.left = left;
    }

    @Override
    public Expression right(){
        return right;
    }
    public void setRight(Expression right){
        this.right = right;
    }

    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate(){
        if(right.evaluate() == 0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        int result = left.evaluate() / right.evaluate();
        return result;
    }
    @Override
    public String toString() {
        return left.toString() + " / " + right.toString();
    }
}
