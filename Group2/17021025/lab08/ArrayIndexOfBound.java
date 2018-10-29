public class ArrayIndexOfBound {
    public void printInt(int[] arr, int pos) throws ArrayIndexOutOfBoundsException{
        System.out.println(arr[pos]);
    }
    public static void main(String[] args){
        ArrayIndexOfBound arrayIndexOfBound = new ArrayIndexOfBound();
        int[] arr = new int[5];
        try {
            arrayIndexOfBound.printInt(arr, 6);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
