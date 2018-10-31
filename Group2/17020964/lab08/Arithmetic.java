package lab8;

public class Arithmetic extends Exception{
	public static int phepchia(int a,int b) throws Arithmetic {
		return a/b;
	}
	public static void main(String[] args) {
		try {
			System.out.println(phepchia(3,0));
		} catch (Arithmetic e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
