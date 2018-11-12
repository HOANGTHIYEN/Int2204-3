
package lap8b2;

public class ArithmeticException {
    public int Division(int a, int b) throws java.lang.ArithmeticException{
        return a/b;
    }

    public static void main(String[] args) {
        try {
            new ArithmeticException().Division(1, 0);
        }catch (java.lang.ArithmeticException e){
            System.err.println(e);
        }
    }
}
