package Exception;

public class IOexception {
    public static void main(String[] args){
        try{
            test4();
        }
        catch (ArithmeticException err){
            System.out.println(err);
        }
    }
    public static void test4(){
        System.out.println(10/0);
    }
}
