package bai2;

public class ClassCastException {
    public void ClassCast() throws java.lang.ClassCastException {
        Object st1 = new String("123");
//        String st1 = new String("hi");
        int num = (int) st1;
        System.out.println((num));
    }
    public static void main(String[] args){
        try {
            new ClassCastException().ClassCast();
        }catch (java.lang.ClassCastException err){
            System.out.println(err);
        }
    }
}
