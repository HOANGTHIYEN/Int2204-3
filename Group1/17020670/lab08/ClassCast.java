/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Admin
 */
public class ClassCast {
    public static void main(String[] args) {
        try
        {
            Object number=new Integer(10);
            System.out.println((String) number);
        }
        catch(java.lang.ClassCastException e)
        {
            System.out.println(e);
        }
    }
}
