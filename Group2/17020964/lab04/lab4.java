package lab4;

public class lab4 {
	public static int maxint(int a, int b) {
		if(a>b) {
			return a;
		}else return b;
	}
	public static int minarr(int[] arr) {
		int temp = 99999;
		for(int i=0;i<arr.length;i++) {
			if(temp>=arr[i])
			{
				temp=arr[i];
			}
		}
		return temp;
		
	}
	public static String BMI(double kg, double m) {
		double BMI = kg/(m*m);
		if(BMI<18.5) {
			System.out.println("Thiếu cân");
			String n = "Thiếu cân";
			return n;
					
		}
			
		else if(BMI>=18.5&&BMI<23) {
			System.out.println("Bình thường");
			String n = "Bình Thường";
			return n;
		}
			
		else if(BMI>=23&&BMI<=25) {
			System.out.println("Thừa cân");
			String n = "Thừa Cân";
			return n;
		}
			
		else if(BMI>25) {
			System.out.println("Béo phì");
			String n = "Béo phì";
			return n;
		}
		return "";
			
	}
	public static void main(String[] args) {
		System.out.println("Thiếu cân");
	}

}
