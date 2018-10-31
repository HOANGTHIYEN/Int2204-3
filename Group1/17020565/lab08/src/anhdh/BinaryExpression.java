package anhdh;

public abstract class BinaryExpression extends Expression{
    public BinaryExpression(){}
    public abstract Expression left();
    public abstract Expression right();


}