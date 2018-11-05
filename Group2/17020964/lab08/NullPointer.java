package lab8;

public class NullPointer extends Exception{
	public static void nullP() {
		String s = null;
	    System.out.println(s.length());
	}
	public static void main(String[] agrs) {
		try {
			nullP();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
