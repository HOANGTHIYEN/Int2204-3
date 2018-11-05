package lab08;

public class NullPointer {
	String str;
    public void test() throws NullPointerException{
        System.out.println(str.length());
    }
    public static void main(String[] args){
        try {
            new NullPointer().test();
        } catch (NullPointerException e) {
            System.out.println("Xau rong");
        }
    }
}
