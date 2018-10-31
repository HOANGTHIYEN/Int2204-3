/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

/**
 *
 * @author Administrator
 */
public class ArrayIndex {
    public ArrayIndex()
    {
    }
   public void array(int [] arr) throws ArrayIndexOutOfBoundsException
   {   
       System.out.println(arr[101]);
   }
    public static void main(String[] args) {
        int[] arr = new int [100];
        try {   new ArrayIndex().array(arr);
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {    System.out.println(e);
        }
    }
}

