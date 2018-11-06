package lab08;


public class ClassCastException extends Exception {
	public static void test() throws ClassCastException
    {
        Object o = new String();
        int i = (int) o;
    }
    public static void main(String args[])
    {
        try
        {
            test();
            System.out.println("ok");
        }
        catch (ClassCastException e)
        {
        
            System.out.println("Error");
        }
    }

}
