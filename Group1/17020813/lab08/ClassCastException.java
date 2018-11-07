package lap8b2;

public class ClassCastException {
    public static void main (String args[]) throws java.lang.ClassCastException {
        try{
            Object obj = new Integer(3);
            String s = (String) obj;
        }
        catch(java.lang.ClassCastException e)
        {
            System.err.println(e);
        }
    }
}
