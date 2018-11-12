package bai2;

public class NullPointerException extends Throwable{
    String st1;
    public void printString() throws java.lang.NullPointerException{
        System.out.println(st1.length());
    }
    public static void main(String[] args){
        try{
            new NullPointerException().printString();
        }catch (java.lang.NullPointerException err){
            System.out.println(err);
        }
    }
}
