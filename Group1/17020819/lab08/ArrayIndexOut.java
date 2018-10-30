package Bai2;

public class ArrayIndexOut {
    public void Arr(int[] arr, int index) throws ArrayIndexOutOfBoundsException{
            System.out.println(arr[index]);           //in ra giá trị bằng 0
    }
    public static void main(String[] args){
        int[] arr = new int[5];
        try {
            ArrayIndexOut ar = new ArrayIndexOut();
            ar.Arr(arr, 6);
        } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown : "+e);
        }
    }
}
