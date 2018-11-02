/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;
 
import java.lang.NullPointerException;
import java.lang.ArithmeticException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ClassCastException;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
        
public class Lab08 {

    public void NullPointer() throws NullPointerException {
        String S = null;
        System.out.print("Ta co: " + S.length());
    }
    
    public void Arithmetic() throws ArithmeticException {
        int a = 99/0;
        System.out.print(a);
    }
    
    public void ArrayIndex() throws ArrayIndexOutOfBoundsException {
        int[] Arr = new int[5];
        Arr[10] = 100;
    }
    
    public void ClassCast() throws ClassCastException {
        Object n = Integer.valueOf(23);
        n = (String) n;
    }
    
    public void IOE() throws IOException {
        int n = 0;
        if (n==0) {
            throw new IOException();
        }
    }
    
    public void FileNotFound() throws FileNotFoundException {
        FileReader fileIS = new FileReader("Hello"); 
    }
    
    public static void main(String[] args) {
        Lab08 Test = new Lab08();
        try {   
            Test.NullPointer();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        try {
            Test.Arithmetic();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } 
        try {
            Test.ArrayIndex();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        try {
            Test.ClassCast();
        } catch (ClassCastException e) {
            System.out.println(e);
        }
        try {
            Test.IOE();
        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            Test.FileNotFound();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    
}
