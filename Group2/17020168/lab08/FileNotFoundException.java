package bai2;

import java.io.File;
import java.io.FileInputStream;

public class FileNotFoundException {
    public static void main(String[] args) throws java.io.IOException {
        try {
            File file = new File("124.txt");
//            file.createNewFile();
            FileInputStream is = new FileInputStream(file);
            is.read();
        }catch (java.io.IOException err){
            System.out.println(err);
        }
    }
}
