public class NullPointer {
    String s;
    public void Print() throws NullPointerException{
        System.out.println(s.length());
    }
    public static void main(String[] args){
        try {
            NullPointer nullPointer = new NullPointer();
            nullPointer.Print();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
