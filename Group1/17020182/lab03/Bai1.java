package lab3_1;

import java.util.Scanner;

public class Bai1 {
	public static Scanner scanner = new Scanner(System.in);
	
	// giai thuat euclid 
	public static int  USCLN(int a,int b){
		if(b==0) return a;
		if(b==0) return b;
		return USCLN(b,a%b); //a mod b
	}
	
	//ham de quy tinh so fibonaci thu a
	public static int Fibo(int a){
		if(a==1||a==0)
		{
			return a;
		}
		else return Fibo(a-1)+Fibo(a-2);
	}
	
	
	// ham chinh
	public static void main(String[] args) {
		System.out.println("Nhap n = ");
		int n = scanner.nextInt();  //nhap so n
	    System.out.printf("Fibonacci of %d is: %d\n",n, Fibo(n));
	    System.out.println("Nhap so nguyen  a = ");
		int a = scanner.nextInt();
		System.out.println("Nhap so nguyen  b = ");
		int b = scanner.nextInt();
		System.out.println("UCLN cua " + a + " va " + b + " la: " + USCLN(a,b));
	    
	}	
}