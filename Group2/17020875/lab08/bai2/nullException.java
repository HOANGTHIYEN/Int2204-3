package bai2;

public class nullException {
    public void test() throws NullPointerException
    {
        String s = null;
        System.out.println(s.length());

    }
    public static void main(String args[])
    {
        try
        {
            nullException a = new nullException();
            a.test();
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
    }
}
