public abstract class Expression {

    public String toString(){
        return this.evaluate() + "";
    };

    public abstract int evaluate();
}
