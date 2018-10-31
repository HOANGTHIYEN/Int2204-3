package lab08;

public class ArrayIndex {
	public void test(int[] ar, int x) throws ArrayIndexOutOfBoundsException{
        System.out.println(ar[x]);
    }
    public static void main(String[] args){
        int[] ar = new int[0];
        try {
            new ArrayIndex().test(ar, 1);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Qua kich thuoc cua mang");
        }
    }
}
