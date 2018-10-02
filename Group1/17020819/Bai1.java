package com.company;
import java.util.Scanner;
public class Bai1 {

    public int fibonaci(int n){      //ham de qui
        if(n==0||n==1)          //f[0]=f[1]=1
            return 1;
        else
            return fibonaci(n-1)+fibonaci(n-2);     //f[n]=f[n-1]+f[n-2]
    }

    public int ucln(int a, int b)            //tinh ucln cua a va b theo thuat toan Euclid
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

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
	Bai1 b1 = new Bai1();    
        int a,b,n;
        a=scan.nextInt();
        b=scan.nextInt();
        n=scan.nextInt();

	    System.out.println("UCLN cua a & b là : " + b1.ucln(a,b));
        System.out.print("fibonaci thu "+n+" bang " + b1.fibonaci(n));
    }
}
