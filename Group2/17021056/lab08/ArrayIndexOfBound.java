/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau2lab08;

/**
 *
 * @author Administrator
 */
public class ArrayIndexOfBound {
    public ArrayIndexOfBound()
    {
    }
   public void Array(int [] arr , int output) throws ArrayIndexOutOfBoundsException
   {    System.out.println(arr[output]);
   }
    public static void main(String[] args) {
        int [] arr = new int [100];
        try {   new ArrayIndexOfBound().Array(arr, 1001);
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {    System.out.println("Mảng không có phần tử này");
        }
    }
}
