import java.util.*;
public class bai1 {
    public static void main (String[] args){
        bai1 test = new bai1();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("UCLN cua 2 so"+a+" va "+b +"la: "+test.UCLN(a,b));
        int n = sc.nextInt();
        System.out.println("Fibonaci cua "+ n+": "+ test.fibonaci(n));
    }
    public int UCLN  (int a, int b){

        while (a != b)
        {
            if (a > b)
            {
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        return a;
    }
    public int fibonaci ( int n)
    {
        if(n == 0) return 0;
        else if (n == 1 ) return 1;
        else {
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
}
