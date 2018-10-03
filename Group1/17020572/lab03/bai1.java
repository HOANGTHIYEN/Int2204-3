package com.company;
public class bai1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        bai1 c=new bai1();
        System.out.println(c.UCLN(10, 6));
        System.out.println(c.fibo(10));
    }
    public int UCLN(int a, int b) {
        if (a<0) a = -a;
        if (b < 0) b = -b;
        if (a== 0) return b;
        else if (b == 0 ) return a;
        else {

            while (a!=b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            return a;
        }
    }
    public long fibo(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int f0 = 0;
        int f1 = 1;
        return fibo(n-2) + fibo(n-1);
    }
}