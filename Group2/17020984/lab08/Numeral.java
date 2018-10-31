public class Numeral extends Expression{
    public int value;

    public Numeral(){
        this.value = 1;
    }
    public Numeral(int value){
        this.value = value;
    }
    @Override
    public String toString() {
        return null;
    }

    @Override
    public int evaluate() {
        return value;
    }
}
