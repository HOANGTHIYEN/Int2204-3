package lab08.bai2;

import java.io.*;

public class FileNotFoundException {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        try {
            File file = new File("xyz.txt");
            InputStream in = new FileInputStream(file);
            in.close();
        }
        catch(java.io.IOException e){
            System.err.println(e);
        }
    }
}
