abstract class BinaryExpression extends Expression{

    @Override
    abstract public int evaluate();
    abstract public String toString();

    abstract public Expression left();
    abstract public Expression right();
}
