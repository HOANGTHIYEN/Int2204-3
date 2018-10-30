public class Arithmetic {
    public int Split(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args){
        try {
            Arithmetic arithmetic = new Arithmetic();
            System.out.println(arithmetic.Split(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
