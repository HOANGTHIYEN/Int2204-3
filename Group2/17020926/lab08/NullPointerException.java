package lab08;

public class NullPointerException extends Exception {
	public static void input() throws NullPointerException {
		String n = null;
		System.out.println(n.length());
	}
	public static void main(String[] agrs) throws NullPointerException {
		try {
			input();
		}catch(NullPointerException n) {
			System.out.println("Error");
		}
	}
}
