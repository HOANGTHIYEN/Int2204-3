/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cau2p2_Lap8;

/**
 *
 * @author Nguyễn Thái
 */
public class ArrayIndexOfBoundEx {

   public void PrintArray(int [] array , int i) throws ArrayIndexOutOfBoundsException
   {    
       System.out.println(array[i]);
   }
    public static void main(String[] args) {
        int [] arr = new int [10];
        
        try {  
            new ArrayIndexOfBoundEx().PrintArray(arr, 20);
            }
        catch(ArrayIndexOutOfBoundsException e)
        {    
            System.out.println("Mảng không có phần tử này" + e.getMessage());
        }
        
    }
}
