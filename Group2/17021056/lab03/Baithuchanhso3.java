/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baithuchanhso3;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Baithuchanhso3 {

    public int UCLN(int a,int b)
    {       a=abs(a); 
            b=abs(b);            
            if (a==0 ||b==0)
                return a+b;
            while (a!=b)
            {
                if(a>b)
                    a=a-b;
                else
                    b=b-a;
            }
            return a;
    }
    
    public void Fib(int n)
    {      
            int[] fib= new int[100];
            fib[0]=0;
            fib[1]=1;
            if(n==0)
            System.out.println(0);
            else if(n==1)
            System.out.println(1);        
            else
            {
            for(int i=2;i<n;i++)
            {   fib[i]=fib[i-1]+fib[i-2];
              
            }
            for(int i=0;i<n;i++)
                System.out.println(fib[i]);
            }
    }
    public static void main(String[] args) {
        int a,b;
        int Val;
        Baithuchanhso3 Makeit = new Baithuchanhso3();
        Scanner inp = new Scanner(System.in) ;
        a=inp.nextInt();
        b=inp.nextInt();
        System.out.println("Ket qua bai Ucln la : " + Makeit.UCLN(a,b) + "\n\n" );
        Val=inp.nextInt();    
        Makeit.Fib(Val);
    } 
    
}
