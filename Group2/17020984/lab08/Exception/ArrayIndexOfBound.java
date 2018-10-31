package Exception;

public class ArrayIndexOfBound {
    public static void main(String[] arg){
        System.out.println("ok1");
        try{
            test1();
        }
        catch(ArrayIndexOutOfBoundsException err){
            System.out.println(err);
        }
        System.out.println("ok2");
    }
    public static void test1(){
        int[] arr = new int[3];
        System.out.println(arr[4]);
    }
}
