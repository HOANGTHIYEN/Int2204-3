package lab08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bai2 {
    public static void throws1() throws NullPointerException {
       String s=null; 
       System.out.println(s.length());
    }
    public static void throws2() throws ArrayIndexOutOfBoundsException {
         int a[]=new int[5];  
        System.out.println(a[10]);
    }
    public static void throws3() throws ArithmeticException {
        System.out.println(50/0);
    }
    public static void throws4() throws ClassCastException {
        Object i = Integer.valueOf(42);
        System.out.println((String) i);
    }
  
    public static void throws6() throws FileNotFoundException {
        Scanner scan = new Scanner(new File("dict.txt"));
        String target = scan.next();
        System.out.println(target);
    }


public static void main(String[] args)
    {
        //TH1
        try {
           throws1();
       }
       catch (Exception e)
       {
           System.out.println("NULL Pointer!!!");
       }
       //TH2
       try {
           throws2();
       }
       catch (Exception e)
       {
           System.out.println("Tran mang!!!");
       }
       //TH3
       try {
           throws3();
       }
       catch (Exception e)
       {
           System.out.println("Loi so hoc!");
       }
        //TH4
        try {
           throws4();
       }
       catch (Exception e)
       {
           System.out.println("Ep kieu khong hop le");
       }
        //TH5
      
         //TH6
        try {
           throws6();
       }
       catch (Exception e)
       {
           System.out.println("File not found!");
       }
    
    }
}
