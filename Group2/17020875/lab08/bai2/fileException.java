package bai2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileException {
    public void test() throws FileNotFoundException
    {
        //FileInputStream fis = new FileInputStream("C:\\Users\\Black\\Desktop\\mai.txt");
        FileInputStream fis = new FileInputStream("C:\\Users\\Black\\Desktop\\abc.txt");
    }
    public static void main(String args[])
    {
        try
        {
            fileException a = new fileException();
            a.test();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
    }
}
