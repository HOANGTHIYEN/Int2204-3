package lab08;

import java.io.*;
import java.io.FileNotFoundException;

public class IOException extends Exception {
	public static void test() throws IOException, FileNotFoundException
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\g1\\Documents\\17020926\\ouput.txt");

    }
    public static void main(String args[]) throws FileNotFoundException
    {
        try
        {
            test();
            System.out.println("ok");
        }
        catch (IOException i)
        {
            System.out.println("Error");
        }
    }
}