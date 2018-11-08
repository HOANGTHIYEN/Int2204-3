package bai2;

import java.lang.reflect.Array;

public class ArrayIndexOfBoundException  {
    public void printArray() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[10];
        System.out.println(arr[100]);
    }
    public static void main(String[] args){
        try{
            new ArrayIndexOfBoundException().printArray();
        }catch (ArrayIndexOutOfBoundsException err){
            System.out.println(err);
        }
    }
}
