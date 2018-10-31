package bai2;

public class ArithmeticException {
    public int div(int a,int b) throws java.lang.ArithmeticException{
        return a/b;
    }
    public static void main(String[] args){
        try{
            new  ArithmeticException().div(15,0);
        }catch (java.lang.ArithmeticException err){
            System.out.println(err);
        }
    }
}
