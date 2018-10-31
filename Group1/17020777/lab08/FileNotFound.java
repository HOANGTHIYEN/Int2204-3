
package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFound {
    public void writeFile() throws FileNotFoundException, IOException {        
        FileWriter fw = new FileWriter("data.txt");
        fw.write("Xu ly ngoai le trong java");
        fw.close();
    }

    public static void main(String args[]) throws IOException {
        try {
            FileNotFound io = new FileNotFound();
            io.writeFile();
        } catch (FileNotFoundException ioe) {
            System.out.println("Co loi ghi file: "+ ioe);
        }
    }
}
