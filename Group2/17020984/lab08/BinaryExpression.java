public abstract class BinaryExpression extends Expression {

    public abstract Expression left();
    public abstract Expression right();

    @Override
    public String toString() {
        return super.toString();
    }
}
