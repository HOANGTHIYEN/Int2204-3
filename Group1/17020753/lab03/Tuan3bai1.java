/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan3bai1;

/**
 *
 * @author duongvanhoa
 */
public class Tuan3bai1 {
   
    public int UCLN(int a, int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==b) return a;
        if(a>b) return UCLN(a-b, b);
        else return UCLN(a, b-a);
    }
    
    public int Fibonacci(int n){
         if(n == 0 || n==1  ){return n;}
         else{
             return Fibonacci(n-1)+ Fibonacci(n-2);
         }
       
    }
    
    public static void main(String[] args) {
        Tuan3bai1 test= new Tuan3bai1(); 
        // in ra UCLN của 6 và 9.
        System.out.println("UCLN của 6 và 9");
        System.out.println(test.UCLN(-6, 9)); 
        // in ra số fibonacci thứ 6 = 8
        System.out.println("số fibonacci thứ 6");
         System.out.println(test.Fibonacci(6));
    }
    
}
