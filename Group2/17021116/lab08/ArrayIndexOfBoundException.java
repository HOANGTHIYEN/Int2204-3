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
public class ArrayIndexOfBoundException {
    public static void main(String[] args){
        // TODO code application logic here
        try{
        int[] array = {1,2};
        System.out.println(array[2]);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
    
}
