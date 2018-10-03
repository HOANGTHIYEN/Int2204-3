package lab03;
import java.util.Scanner;
public class bai1 {
	public int ucln(int a,int b) {
		if(a==b)	return Math.abs(a);
		else if(a>b)	return ucln(Math.abs(a-b),Math.abs(b));
		else	return ucln(Math.abs(a),Math.abs(b-a));
	}
	public int fibonacci(int n) {
		if(n==0)	return 0;
		else if(n==1)return 1;
		else	return fibonacci(n-1)+fibonacci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bai1 ucln = new bai1();
		bai1 fi = new bai1();
		Scanner sc = new Scanner(System.in);
		int a,b;
		a = sc.nextInt();
		b = sc.nextInt();
		int n;
		n = sc.nextInt();
		System.out.println(ucln.ucln(a, b));
		System.out.println(fi.fibonacci(n));
		sc.close();
	}

}
