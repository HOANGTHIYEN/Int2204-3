
package Ex1;

public class Arithmetic {
    public int Div(int a, int b) throws ArithmeticException{       
        return a/b;
    }
    public static void main(String[] args){

        try {
            Arithmetic arith = new Arithmetic();
            System.out.println(arith.Div(5, 0));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
