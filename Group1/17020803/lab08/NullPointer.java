package Ex1;

public class NullPointer {
    String s=null;
    public void print() throws NullPointerException{       
        System.out.println(s.length());
    }
    public static void main(String[] args){
        try {
            new NullPointer().print();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}



