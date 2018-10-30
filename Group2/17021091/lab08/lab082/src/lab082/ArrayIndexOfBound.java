/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab082;

/**
 *
 * @author Genius
 */
public class ArrayIndexOfBound {
    public void printInt(int[] arr, int pos) throws ArrayIndexOutOfBoundsException{
        System.out.println(arr[pos]);
    }
    public static void main(String[] args){
        int[] arr = new int[0];
        try {
            new ArrayIndexOfBound().printInt(arr, 2);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
