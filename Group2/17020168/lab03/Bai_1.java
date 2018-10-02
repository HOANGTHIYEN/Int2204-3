
import java.util.Scanner;

public class Bai_1 {
	public static int uoc_chung(int a,int b)
	{
		a=Math.abs(a);
		b=Math.abs(b);
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else 
				b=b-a;
		}
		return a;
	}
	public static	int fibonaci(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else 
			return fibonaci(n-1)+fibonaci(n-2);
	}
	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		int c;
		c = uoc_chung(a,b);
		System.out.println(c);
		System.out.println(fibonaci(20));
	}
}
