/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author CCNE
 */
public class Ex2 {
    public void ArithmeticExceptionDemo() throws ArithmeticException{
              
        System.out.println("Value =" + 10/0);
 
    }
    public void NullPointerExceptionDemo() throws NullPointerException{

        String text = null;
        
        int a = text.length();
        System.out.println("Length text = " + a);
        
        
    }
    public void ArrayIndexOfBoundsExceptionDemo(){
        String[] strs = new String[] { "One", "Two", "Three" };
        
        try{
            String str1 = strs[5];
 
            System.out.println("String at 5 = " + str1);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void ClassCastExceptionDemo()throws ClassCastException{
        Object n = new Numeral(1);    
        Division a = (Division) n;
 
    }
    public void IOExceptionDemo(){
        
    }
    public void FileNotFoundExceptionDemo() throws FileNotFoundException{
        File f = new File("data.txt");
        Scanner scanner = null;
        
        scanner = new Scanner(f);
        
    }
    

}
