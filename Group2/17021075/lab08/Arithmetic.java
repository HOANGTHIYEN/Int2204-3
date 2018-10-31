package lab08;

public class Arithmetic {
	public double test(double a) throws ArithmeticException{
        return Math.sqrt(a);
    }
    public static void main(String[] args){
        try {
            System.out.println(new Arithmetic().test(-10));
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
