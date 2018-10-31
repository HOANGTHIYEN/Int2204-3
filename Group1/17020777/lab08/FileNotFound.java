
package Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String args[]) throws FileNotFoundException {
        File file = new File("abc");
        if (!file.exists()) System.err.println("loi");
    }
}
