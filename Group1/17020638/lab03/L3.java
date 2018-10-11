import java.util.Scanner;

public class L3 {

    public static int nhap() {
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

    public int UCLN(int a, int b) {
        if(a<0)a=-a;
        if(b<0) b=-b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public int fibo(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String args[]) {
         L3 x = new L3();
        System.out.println("Nhap a: ");
        int a = nhap();
        System.out.println("Nhap b: ");
        int b = nhap();
        System.out.println("UCLN cua " + a + " va " + b + ": " + x.UCLN(a, b));

        System.out.println("Nhap n: ");
        int n = nhap();
        System.out.println(x.fibo(n));

    }
}