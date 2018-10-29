package lab08;

public class ArrayIndexOfBoundException extends Exception {
	public static void mang()  {
		int[] a = new int[2];
		a[0] = 6;
		a[1] = 3;
		System.out.println(a[3] + " " +a[1]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			mang();
			
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		
	}

}
