package lab08.bai2;

public class ClassCastException {
    public static void main (String args[]) throws java.lang.ClassCastException {
        try{
            Object obj = new Integer(3);
            String s = (String) obj;
        }
        catch(java.lang.ClassCastException e)
        {
            System.out.println(e);
        }
    }
}
