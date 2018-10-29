package lab08;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException extends Exception {

	public static void test() throws FileNotFoundException, IOException
    {
       FileInputStream fis = new FileInputStream("C:\\Users\\g1\\Documents\\17020926\\output.txt");
    }
    public static void main(String args[]) throws IOException
    {
        try
        {
            test();
            System.out.println("ok");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error");
        }
    }

}
