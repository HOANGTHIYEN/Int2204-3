/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngoaile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

      class ArrayIndex {
	public void test(int[] ar, int x) throws ArrayIndexOutOfBoundsException{
        System.out.println(ar[x]);
    }
      }
class ClassCast {
	public double test(Object s) throws ClassCastException{
        return (double)s;
    }
}

 class FileNotFound {
	public void test(String path) throws FileNotFoundException{
        File f = new File(path);
        Scanner scan = new Scanner(f);
        while(scan.hasNext())
            System.out.println(scan.nextLine());
        scan.close();
    }
}
/**
 *
 * @author CCNE
 */
public class Ngoaile {
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    // loi CHIA CHO 0    
        int x = 20;
        int y = 0;
        try{
            int a = x/y;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    //loi string rong
        String str;
        str = null;
        try {
            System.out.println(str);
        }
        catch(NullPointerException nullPoint){
            System.out.println(nullPoint.getMessage());
        }

    //loi mang
   
        int[] ar = new int[0];
        try {
            new ArrayIndex().test(ar, 1);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Qua kich thuoc cua mang");
        }
        
        
    //loi ep kieu
        try {
            System.out.println(new ClassCast().test("3.14"));
        } catch (ClassCastException e) {
            System.out.println("Ep kieu khong hop le");
        }
        
        
   //loi tim file
         
    try {
            new FileNotFound().test("test.txt");
        } catch (FileNotFoundException e) {
        	System.out.println("Khong tim thay file");
        }
    
    }
    
   
    

}