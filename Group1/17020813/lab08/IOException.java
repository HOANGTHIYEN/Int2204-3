package lap8b2;

import java.io.*;

public class IOException {
    public static void main(String[] args) throws java.io.IOException {
        try {
        File file = new File("xyz.txt");
        file.createNewFile();
        InputStream in = new FileInputStream(file);
            in.close();
            in.read();
        }
        catch(java.io.IOException e){
            System.err.println(e);
        }
    }
}
