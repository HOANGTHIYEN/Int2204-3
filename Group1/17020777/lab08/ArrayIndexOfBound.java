package Ex1;

import java.util.ArrayList;

public class ArrayIndexOfBound {
    public void print(int[] arr, int i) throws ArrayIndexOutOfBoundsException{
        if(i<0||i>=arr.length)
            System.err.println("loi");
    }
}
