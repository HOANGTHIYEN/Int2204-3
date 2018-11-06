
package lap8b2;

public class ArrayIndexOfBoundException {
    public void print() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2};
        System.out.println(arr[3]);
    }

    public static void main(String[] args) {
        try {
            new ArrayIndexOfBoundException().print();
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
    }
}
