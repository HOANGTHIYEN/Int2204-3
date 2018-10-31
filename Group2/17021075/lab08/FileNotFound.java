package lab08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
	public void test(String path) throws FileNotFoundException{
        File f = new File(path);
        Scanner scan = new Scanner(f);
        while(scan.hasNext())
            System.out.println(scan.nextLine());
        scan.close();
    }
    public static void main(String[] args){
        try {
            new FileNotFound().test("test.txt");
        } catch (FileNotFoundException e) {
        	System.out.println("Khong tim thay file");
        }
    }
}
