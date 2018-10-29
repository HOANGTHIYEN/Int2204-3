package bai2;

public class arithException {
    public void test() throws ArithmeticException
    {
        int a = 10/0;
    }
    public static void main(String args[])
    {
        try
        {
            arithException a = new arithException();
            a.test();
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
