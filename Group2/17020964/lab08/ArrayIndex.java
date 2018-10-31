package lab8;

public class ArrayIndex extends Exception{
	public void mang(int a[]) {
		a[0]=0;
		a[1]=1;
		
	}
	public static void main(String[] args) {
		int[] a = new int[2];
		try {
			System.out.println(a[3]);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
