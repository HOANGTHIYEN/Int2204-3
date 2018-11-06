package lab08.bai2;


public class ArithmeticException {
    public int division(int a, int b) throws java.lang.ArithmeticException{
        return a/b;
    }

    public static void main(String[] args) {
        try {
            new ArithmeticException().division(1, 0);
        }catch (java.lang.ArithmeticException e){
            System.err.println(e);
        }
    }
}
