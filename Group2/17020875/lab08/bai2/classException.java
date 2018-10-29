package bai2;

public class classException {
    public void test() throws ClassCastException
    {
        Object o = new String();
        Integer i = (Integer) o;
    }
    public static void main(String args[])
    {
        try
        {
            classException a = new classException();
            a.test();
        }
        catch (ClassCastException e)
        {
            System.out.println(e);
        }
    }
}
