package Exception;

public class NullPointer {
    public static void main(String[] args){
        System.out.println("OK1");
        try {
            throw new Error("Sasiiii");
            //NullPoint();
            //System.out.println("OK2");

        } catch (NullPointerException err) {
            System.out.println(err);
        }
        System.out.println("OK3");
    }
    public static void NullPoint(){
        String abc = null;
        abc.split(".");
    }
}
