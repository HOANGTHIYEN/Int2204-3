/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compare;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Compare {

    /**
     * @param args the command line arguments
     */
    public static int max(int m, int n) 
    {
        if(m>=n) return m;
        else return n;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);       
        int m = scanner.nextInt();       
        int n = scanner.nextInt();
        System.out.println(max(m,n));
    }
    
}
