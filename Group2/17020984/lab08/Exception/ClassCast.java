package Exception;

public class ClassCast {
    public static void main(String[] arg){
        System.out.println("ok1");
        try{
            test3();
        }
        catch(ClassCastException err){
            System.out.println(err);
        }
        System.out.println("ok2");
    }
    public static void test3(){
        Object abc = "as";
        int a = (int) abc;
        System.out.println(a);
    }
}
