package Exception;

public class Arithmetic {
    public static void main(String[] args){
        try{
            test2();
        }
        catch (ArithmeticException err){
            System.out.println(err);
        }
    }
    public static void test2(){
        System.out.println(10/0);
    }
}
