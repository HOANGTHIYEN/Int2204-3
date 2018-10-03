/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmin;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class GetMin {

    /**
     * @param args the command line arguments
     */
    public static int Min(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i]){min=arr[i];}
        }
        return min;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scanner.nextInt();
        }
        System.out.println(Min(arr));
    }
    
}
