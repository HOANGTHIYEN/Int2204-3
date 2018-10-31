package Ex1;

public class NullPointer {
    
    String s;

    public void print() throws   NullPointerException{
        if(s==null)
            System.err.println("loi");
    }
}



