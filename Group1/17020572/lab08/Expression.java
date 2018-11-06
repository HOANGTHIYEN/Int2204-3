/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CCNE
 */
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
    @Override
    public String toString()
    {
        return String.valueOf(value);
    }
    public Numeral(int value) {
        this.value = value;
    }
    public Numeral() {
    }
}
class square extends Expression {
    Expression expression;

    public square(Expression expression) {
        this.expression = expression;
    }
    @Override
    int evaluate() {
        return expression.evaluate() * expression.evaluate();
    }
    @Override
    public String toString()
    {
        return "("+ expression+"^2"+")";
    }
}

abstract class BinaryExpression extends Expression {
    abstract Expression left();
    abstract Expression right();
    /*public String evaluateIn(String str){
        String[] a=str.split("\\s" );
        int length = str.length();
        if(checkParentheses(a))
        {
            int i=0;

            while(i!= length)
            {
                //if(a[i]=="(" || a[i]==")") start++;
                if(isOp(a[i]))
                {
                    left = Integer.parseInt(a[i-1]);
                    right = Integer.parseInt(a[i+1]);
                    if(a[i] == "+")
                    {
                        a[i-1] = String.valueOf(Addition.add(left,right));
                        //return Addition.add(left,right);
                    }
                    if(a[i] == "-")
                    {
                        a[i-1] = String.valueOf(Subtraction.sub(left,right));
                        //return Subtraction.sub(left,right);
                    }
                    if(a[i] == "*")
                    {
                        a[i-1] = String.valueOf(Multiplication.mul(left,right));
                        //return Multiplication.mul(left,right);
                    }
                    if(a[i] == "/")
                    {
                        a[i-1] = String.valueOf(Division.div(left,right));
                        //return Division.div(left,right);
                    }
                    if(a[i] == "^")
                    {
                        a[i-1] = String.valueOf(square.getSquare(left));
                        //return square.getSquare(left);
                    }
                    //a[i+1] = "";
                    //a[i-1] = "";
                    int c;
                    int j;
                    for (c = j = 0; i < length; i++) {
                        if (j != i) {
                            a[c] = a[j];
                            c++;
                        }
                        if (j != i+1) {
                            a[c] = a[j];
                            c++;
                        }
                    }

                    length = c;
                }
                return a[i];
            }

        }
        return "nhap sai";
    }
    boolean isOp(String c){
        return  c == "+" ||
                c == "*" ||
                c == "/" ||
                c == "^" ||
                c == "-";

    }
    public boolean checkParentheses(String[] stringArray){
        int parenCount = 0;

        for(int i = 1; i < stringArray.length - 1;i++){
            if(stringArray[i].charAt(0) == '('){
                parenCount++;
            }
            if(stringArray[i].charAt(0) == ')'){
                parenCount--;
            }
        }
        return parenCount == 0;
    }*/
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
    public String toString()
    {
        return "("+left+"+"+right+")";
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
    public String toString()
    {
        return "("+left+"-"+right+")";
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
    public String toString()
    {
        return "("+left+"*"+right+")";
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
    public String toString()
    {
        return "("+left+"/"+right+")";
    }
}
class testEX {

    public static void main(String[] args) {
        System.out.println("( ( 10 ^ 2 ) - 1 + ( 2 * 3 ) ) ^ 2");
        square s = new square(new Numeral(10));
        Subtraction sub = new Subtraction(s, new Numeral(1));
        Multiplication mul = new Multiplication(new Numeral(2), new Numeral(3));
        Addtion add1 = new Addtion(sub, mul);
        square s1 = new square(add1);
        System.out.println(s1.toString());
        System.out.println(s1.evaluate());
        try {
            Division div = new Division(new Numeral(69), new Numeral(0));
            System.out.println(div.toString());
        } catch (ArithmeticException e) {
            System.out.println("ERROR :" + e);
        }
    }
}
