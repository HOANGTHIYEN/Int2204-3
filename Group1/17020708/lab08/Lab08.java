package lab08;
abstract class Expression {
    abstract int evaluate();
    @Override
    public abstract String toString();
}
    
class Numeral extends Expression{
    int value;
    @Override
    int evaluate(){
        return value;
    }
    public Numeral(){
    }
    public Numeral(int value){
        this.value = value;
    }
    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
class Square extends Expression{
    Expression expression;
    public Square(Expression expression){
        this.expression = expression;
    }
    @Override
    int evaluate(){
        return expression.evaluate()*expression.evaluate();
    }
    @Override
    public String toString(){
        return expression + "^2";
    }
}
abstract class BinaryExpression extends Expression{
    abstract Expression left();
    abstract Expression right();
}
class Addition extends BinaryExpression{
    Expression left;
    Expression right;
    public Addition(Expression left, Expression right){
        this.left =left;
        this.right =right;
    }
    @Override
    Expression left(){
        return left;
    }
    @Override
    Expression right(){
        return right;
    }
    @Override
    int evaluate(){
        return left.evaluate()+ right.evaluate();
    }
    @Override
    public String toString(){
        return "(" + left+ " + " + right + ")";
    }
}
class Subtraction extends BinaryExpression{
    Expression left;
    Expression right;
    public Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    Expression left(){
        return left;
    }
    @Override
    Expression right(){
        return right;
    }
    @Override
    int evaluate(){
        return left.evaluate() - right.evaluate();
    }
    @Override
    public String toString(){
        return "(" + left + " - " + right + ")";
    }
}
class Multiplication extends BinaryExpression{
    Expression left;
    Expression right;
    public Multiplication(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    Expression left(){
        return left;
    }
    @Override
    Expression right(){
        return right;
    }
    @Override
    int evaluate(){
        return left.evaluate() * right.evaluate();
    }
    @Override
    public String toString(){
        return left + "*" + right;
    }
}
class Division extends BinaryExpression{
    Expression left;
    Expression right;
    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    @Override
    Expression left(){
        return left;
    }
    @Override
    Expression right(){
        return right;
    }
    @Override
    int evaluate(){
        return left.evaluate() / right.evaluate();
    }
    @Override
    public String toString(){
        return left + "/" + right ;
    }
}
public class Lab08 {
    public static void main(String[] args) {
        try{
        Square squ = new Square(new Numeral(10));
        
        Subtraction sub = new Subtraction(squ, new Numeral(1));
        Multiplication mul = new Multiplication(new Numeral(2), new Numeral(3));
        Addition add = new Addition(sub, mul);
        Square squ1 = new Square(add);
        System.out.println(squ1.toString() );
        Division div = new Division(new Numeral(1), new Numeral(0));
        
       System.out.println(div.toString());
        }
       catch (ArithmeticException e) {
           System.out.println("Loi chia cho 0 " + e);
       }
    }
    
}
