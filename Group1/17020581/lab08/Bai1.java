package lab08;

abstract class Expression {
    abstract int evaluate();
    public abstract String toString();
}
class Numeral extends Expression {
    int value;
    @Override
    int evaluate () {
       return value;
    }
    
    public Numeral(int value) {
        this.value = value;
    }
    public Numeral() {
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
}
class Square extends Expression {
    Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }
    @Override
    int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    @Override
    public String toString() {
       return  expression.toString() + "^2";
    }
}

abstract class BinaryExpression extends Expression {
     abstract Expression left();
     abstract Expression right();
    
}

class Addtion extends BinaryExpression {
    Expression left;
    Expression right;

    public Addtion(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    Expression left() {
        return left;
    }
    
    @Override
    Expression right() {
        return right;
    }

    @Override
    int evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + "+" + right.toString();
    }
}

class Subtraction extends BinaryExpression {
    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    Expression left() {
        return left;
    }
    
    @Override
    Expression right() {
        return right;
    }

    @Override
    int evaluate() {
        return left.evaluate() - right.evaluate();
    }

    @Override
    public String toString() {
        return left.toString() + "-" + right.toString();
    }
}

class Multiplication extends BinaryExpression {
    Expression left;
    Expression right;

    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    Expression left() {
        return left;
    }
    
    @Override
    Expression right() {
        return right;
    }

    @Override
    int evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String toString() {
    return left.toString() + "*" + right.toString() + ")";   
    }
}

class Division extends BinaryExpression {
    Expression left;
    Expression right;

    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    Expression left() {
        return left;
    }
    
    @Override
    Expression right() {
        return right;
    }

    @Override
    int evaluate() {
        return left.evaluate() / right.evaluate();
    }

    @Override
    public String toString() {
    return left.toString() + "/" + right.toString() + ")";     
    }
}
public class Bai1 {

    public static void main(String[] args) {
       // Bieu thuc = (10^2 - 1 + 2*3)^2
      
           
       Square squ = new Square(new Numeral(10));
      Subtraction sub = new Subtraction(squ,  new Numeral(1));
       Multiplication mul = new Multiplication(new Numeral(2), new Numeral(3));
       Addtion add1 = new Addtion(sub, mul);
       Square squ1 = new Square(add1);
      System.out.print("(");
      System.out.print(squ1.toString());
      System.out.print(" = ");
      System.out.println(squ1.evaluate());
       
       // Thu ngoai le
       try {
       Division div = new Division(add1, new Numeral(0));
       System.out.println(div.evaluate());
       }
       catch (ArithmeticException e){
           System.out.println("Lỗi chia cho 0");
       }
    }
    
}
