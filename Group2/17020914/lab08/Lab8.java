/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.io.FileNotFoundException;

/**
 *
 * @author CCNE
 */
public class Lab8{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Ex2 ex2 = new Ex2();
        try{
            ex2.ArithmeticExceptionDemo();
        }
        catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            ex2.NullPointerExceptionDemo();
        }
        catch(NullPointerException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        ex2.ArrayIndexOfBoundsExceptionDemo();
        
        
        try{
            ex2.FileNotFoundExceptionDemo();
        }
        catch(FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
        try{
            ex2.ClassCastExceptionDemo();
        }
        catch(ClassCastException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
