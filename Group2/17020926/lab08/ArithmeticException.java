package lab08;

public class ArithmeticException extends Exception {
	public static void main(String[] agrs) {
		int a=10;
		int b=0;
		int c;
		try {
			c=a/b;
			System.out.println(c);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}
	}
}
