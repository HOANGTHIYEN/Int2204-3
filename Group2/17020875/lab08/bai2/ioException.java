package bai2;

import java.io.*;

public class ioException {
    public void test() throws IOException
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\Black\\Desktop\\abc.txt");

//        FileWriter fw = new FileWriter("C:\\Users\\Black\\Desktop\\abc.txt");
//        fw.write("hello word 2");
//        fw.close();
    }
    public static void main(String args[])
    {
        try
        {
            ioException e = new ioException();
            e.test();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
