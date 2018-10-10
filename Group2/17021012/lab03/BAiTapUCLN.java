
package baitapucln;

import static java.lang.Math.abs;
import java.util.Scanner;


public class BAiTapUCLN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap a: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhap b: ");
        int num2 = scanner.nextInt();
        System.out.println("UCLN giua a va b la: " +UCLN(num1, num2));
        int n = scanner.nextInt();
        System.out.println("So Fibonacci thu n la: "+Fibonacci(n));
    }
    public static int UCLN (int num1, int num2)
    {
        if(num1==0 || num2==0)
            return 1;
        num1=abs(num1);
        num2=abs(num2);
        
        while (num1 !=num2)
        {
            if(num1>num2) num1-=num2;
            else          num2-=num1;
        }
        return num1;
    }
    public static int Fibonacci(int n)
    {
    
        if(n==0) return 0;
        if(n==1) return 1;
        else {int arr[] = new int[n];
                arr[0] = 0;
                arr[1] = 1;
                for (int i = 2; i < arr.length; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                     }
                     return arr[n-1];   
              }
    
}}
