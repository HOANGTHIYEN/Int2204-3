import java.util.Scanner;
public class UCLN{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
            int a = sc.nextInt();
            int b = sc.nextInt();
        System.out.println(UC(a,b));   
    }
    public static int UC(int a,int b)
    {
        if(b==0) return a;
        return UC(b,a%b);
    }
}