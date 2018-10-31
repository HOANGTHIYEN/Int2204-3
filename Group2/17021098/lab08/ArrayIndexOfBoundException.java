package lab08.bai2;

public class ArrayIndexOfBoundException {
    public void print() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2};
        System.out.println(arr[2]);
    }

    public static void main(String[] args) {
        try {
            new ArrayIndexOfBoundException().print();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
