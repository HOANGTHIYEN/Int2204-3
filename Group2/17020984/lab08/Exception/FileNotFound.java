package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] arg){
        try{
            Scanner input = new Scanner(new File("data.txt"));
            int n = input.nextInt();
            System.out.print(n);
            input.close();
        }
        catch(IOException err){
            System.out.println(err);
        }
        System.out.println("ok");
    }
}
