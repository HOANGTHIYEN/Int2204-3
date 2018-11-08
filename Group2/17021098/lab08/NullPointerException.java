package lab08.bai2;

public class NullPointerException extends Throwable {
    public void print(String a) throws java.lang.NullPointerException{
        System.out.println(a.length());
    }

    public static void main(String[] args) {
        String a = null;
        try {
            new NullPointerException().print(a);
        } catch (java.lang.NullPointerException e){
            System.out.println(e);
        }
    }
}
