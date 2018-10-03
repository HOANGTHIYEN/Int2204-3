package lap03;

import java.util.Scanner;

public class Ex1{

    //ham nhap
    public int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.println("Nhap du lieu so: ");
                input.nextLine();
            }
        }
        return (n);
    }

    //ucln
    public  int UCLN(int a, int b) {
        while (a != b) {
            if (a < 0) {
                a = -a;
            }
            if (b < 0) {
                b = -b;
            }
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return (a);
    }

    //fibo
    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    //main
    public static void main(String[] args) {
        Ex1 x = new Ex1();
        
        System.out.println("cau 1a: " + "\n" + "_____________________");
        System.out.println("Nhap a: ");
        int a = x.nhap();
        System.out.println("Nhap b: ");
        int b = x.nhap();
        System.out.println("UCLN cua " + a + " va " + b + ": " + x.UCLN(a, b));

        System.out.println("\n" + "_____________________" + "\n" + "cau 1b: ");
        System.out.println("Nhap n: ");
        int n = x.nhap();
        System.out.print(x.fibonacci(n));

    }

}