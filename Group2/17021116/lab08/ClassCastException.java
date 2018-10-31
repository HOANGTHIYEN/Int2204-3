/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author 123456789
 */
public class ClassCastException {
    public static void main(String[] args){
         // TODO code application logic here
        try{
            Object num = 0;
            System.out.println((String)num);
        }
        catch (java.lang.ClassCastException e){
            System.out.println(e);
        }
    }    
}
