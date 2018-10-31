/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08;

/**
 *
 * @author Hoangson
 */
public class ClassCastException {
    public static void main(String[] args)  {
        try{
            Object num = new Integer(0); // TODO code application logic here
            System.out.println((String)num);;
        }
        catch (java.lang.ClassCastException e){
            System.out.println(e);
        }
    }    
}
