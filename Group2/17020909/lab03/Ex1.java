public class Ex1 {
	public int UCLN(int a, int b) {
		if (a<0) a=0-a;
		if (b<0) b=0-b;
		while (a != b) {
			if (a<b) b=b-a;
			else if (a>b) a=a-b;
		}
		return a;
	}
	
	public int Fibo(int n) {
		if (n==0) return 1;
		else if (n==1) return 1;
		else return Fibo(n-1)+Fibo(n-2);
	}
	
	public static void main(String args[]) {
		
		Scanner Set = new Scanner(System.in);
		int a,b,n;
		System.out.println("Nhap so a: );
		a = Set.nextInt();
		System.out.println("Nhap so b: );
		b = Set.nextInt();
		
		Ex1 Vidu = new Ex1();
		System.out.println("Uoc chung lon nhat cua " + a + " va " + b " la: " + Vidu.UCLN(a,b));
		System.out.println("Nhap so n: );
		n = Set.nextInt();
		System.out.println("So Fibonaci thu n la: " + Vidu.Fibo(n));
		
	}
} 