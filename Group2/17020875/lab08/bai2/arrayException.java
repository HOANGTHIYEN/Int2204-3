package bai2;

public class arrayException {
    public void test() throws ArrayIndexOutOfBoundsException
    {
        int[] a = new int[5];
        a[10] = 4;

    }
    public static void main(String args[])
    {
        try
        {
            arrayException a = new arrayException();
            a.test();
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
    }
}
