package Main;

public class Division extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Division(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    public Expression right() {
        return this.right;
    }

    @Override
    public int evaluate() throws ArithmeticException {
        if (this.right.evaluate() == 0) {
            throw new ArithmeticException("Lỗi chia cho 0");
        }
        int result = this.left.evaluate() / this.right.evaluate();
        return result;
    }

    @Override
    public String toString() {
        return "Division{" +
                "left=" + left +
                ", right=" + right +
                '}' +
                "equals= " + evaluate();
    }
}
