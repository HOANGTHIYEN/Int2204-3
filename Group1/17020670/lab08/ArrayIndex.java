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
public class ArrayIndex {
    public static void main(String[] args) {
        try
        {
            int [] arr={1,3,4,7,8};
            System.out.println(arr[10]);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
