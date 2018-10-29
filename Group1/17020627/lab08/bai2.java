
package tuan8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class bai2 {

  

    public static void main(String[] args) throws IOException {
        NullPointerException();
        ArrayIndexOutOfBoundsException();
        ArithmeticException();
        ClassCastException();
        FileNotFoundException();
     
    }

    
    public static void NullPointerException() throws NullPointerException {
        try {
            String s = null;
           System.out.print( s.equals("do") );
          }catch(NullPointerException e) {
            System.out.println("Error: " + e);
        }

    }

    // ArrayIndexOfBoundException
    public static void ArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        try {
            int[] arr = { 0, 1 };
            System.out.println(arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        }

    }

    // ArithmeticException
    public static void ArithmeticException() throws ArithmeticException {
        try {
            System.out.println(0 / 0);
        }catch(ArithmeticException e) {
            System.out.println("Error: " + e);
        }

    }

    // ClassCastException
    public static void ClassCastException() throws ClassCastException {
        try {
            Object i = 42;
            String s = (String)i;
            System.out.println(s);
        }catch(ClassCastException e) {
            System.out.println("Error: " + e);
        }

    }

    // FileNotFoundException
    public static void FileNotFoundException() throws FileNotFoundException {
        try {
            BufferedReader rd = new BufferedReader(new FileReader(new File("File???")));
        } catch (FileNotFoundException ex) {
            System.out.println("Error: " + ex);
        }
    }

   
}

