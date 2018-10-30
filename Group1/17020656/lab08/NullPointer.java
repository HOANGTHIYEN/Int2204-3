/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap8;

/**
 *
 * @author Admin
 */
public class NullPointer {
    public static void main(String[] args) {
        try
        {
            Object number=null;
            number.toString();
        }
        catch(java.lang.NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
