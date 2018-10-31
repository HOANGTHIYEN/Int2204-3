package week008;
class Addition extends BinaryExpression {
private Expression left;
private Expression right;
public  Addition(Expression left, Expression right){
this.left = left;
this.right = right;
}

@Override
public Expression left() {
return this.left;
}

@Override
public Expression right() {
return this.right;
}

@Override
public String toString() {
return "+" ;

}
@Override
public int evaluate() {
return left.evaluate() + right.evaluate();
}
}