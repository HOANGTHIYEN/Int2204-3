import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static File file;
    public static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = "D:\\Learn\\Python\\test.py";
        String path2 = "D:\\Learn\\Python\\test.txt";
        String result = readContentFromFile(path);
        writeContentToFile(path2, true);
        File file  = findFileByName("D:\\Learn\\Python", "bai 2ád.py");

        System.out.println((file == null ? "False" : file.exists()));
    }

    public static String readContentFromFile(String path) {
        file = new File(path);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file, "utf8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        str = "";
        while (scanner.hasNextLine()) {
            str += scanner.nextLine();
        }
        scanner.close();
        return str;
    }

    public static void writeContentToFile(String path, boolean bool){
        file = new File(path);
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(file, bool);
            System.out.println(str);
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File dir = new File(folderPath);
        File[] fileArr = dir.listFiles();
        for (File search : fileArr) {
            if (search.getName().equals(fileName) )
                return search;
        }
        return null;
    }
}
