package lab08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.*;

public class Test2 {
	public static void main(String[] args) throws IOException{
		NullPointerException();
		ArrayIndexOutOfBoundsException();
		ArithmeticException();
		ClassCastException();
		FileNotFoundException();
		IOException();
	}
	
	public static void NullPointerException() throws NullPointerException {
		try {
			String s = null;
			System.out.println(s.equals("test"));
		} catch (NullPointerException  e) {
			System.out.println("Error_NullPointerException(): "  + e);
		}
	}
	
	public static void ArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        try {
            int[] arr = { 0, 1 };
            System.out.println(arr[100]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error_ArrayIndexOutOfBoundsException(): " + e);
        }

    }

   
    public static void ArithmeticException() throws ArithmeticException {
        try {
            System.out.println(10 / 0);
        }catch(ArithmeticException e) {
            System.out.println("Error_ArithmeticException(): " + e);
        }

    }

  
    public static void ClassCastException() throws ClassCastException {
    	try {
			Object i = Integer.valueOf(23);
		i = (String) i;
		}catch(ClassCastException c) {
			System.out.println("Error_ClassCastException(): " + c);
		}

    }

   
    public static void FileNotFoundException() throws FileNotFoundException{
        try {
        	
			FileInputStream fi = new FileInputStream( "test1.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Error_FileNotFoundException(): " + ex);
        }
    }

   
    public static void IOException() throws IOException {
        try {
            throw new IOException();
        } catch(IOException e) {
            System.out.println("Error_IOException(): " + e);
        }

    }

}
