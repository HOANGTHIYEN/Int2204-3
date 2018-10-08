/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1b;

/**
 *
 * @author MANH HOANG
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class Bai1b {

    /**
     * @param args the command line arguments
     */
    
    static int fibonaci(int n) {
        if(n==0||n==1)
            return 1;
        else
            return fibonaci(n-1) + fibonaci(n-2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        Scanner hoang = new Scanner(System.in);
        n=hoang.nextInt();
        System.out.println(fibonaci(n));
    }
    
}
