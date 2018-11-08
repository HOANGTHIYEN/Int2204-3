package Ex1;

import java.util.ArrayList;

public class ArrayIndexOfBound {
    public void Arr(int[] arr, int index) throws ArrayIndexOutOfBoundsException{
            System.out.println(arr[index]);
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        try {
            ArrayIndexOfBound ar = new ArrayIndexOfBound();
            ar.Arr(arr, 6);
        } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown : "+e);
        }
    }
}
