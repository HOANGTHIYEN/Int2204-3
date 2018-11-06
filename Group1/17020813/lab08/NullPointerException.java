package lap8b2;

public class NullPointerException  {
    String a;
    public void print() throws java.lang.NullPointerException{
        System.out.println(a.length());
    }

    public static void main(String[] args) {
        try {
            new NullPointerException().print();
        } catch (java.lang.NullPointerException e){
            System.err.println(e);
        }
    }
}
