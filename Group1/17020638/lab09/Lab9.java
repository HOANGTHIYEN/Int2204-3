package lab9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab9 {

    public static String readContentFromFile(String path) {
        String content = null;
        try {      
            BufferedReader br = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();//một chuỗi 
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            content = sb.toString();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return content;
    }

    //xóa nội dung có trong tệp rồi mới thêm nội dung mới
    public static void writeContentToFile(String path) {
        try {
            FileWriter fW = new FileWriter(path);
            PrintWriter pW = new PrintWriter(fW);
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhập nội dung mới: ");
            String n = scan.nextLine();
            pW.println(n);
            fW.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    //bổ sung nội dung vào cuối tệp mà ko xóa nội dung cũ
    public static void writeContentToFilenoDelete(String path) {
        try {
            FileWriter fW = new FileWriter(path, true);
            PrintWriter pW = new PrintWriter(fW);
            Scanner scan = new Scanner(System.in);
            System.out.println("Nhập nội dung mới: ");
            String n = scan.nextLine();
            pW.println(n);
            fW.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File Folder = new File(folderPath);
        File[] listFile = Folder.listFiles(); 
        File result = null;
        for (int i = 0; i < listFile.length; i++) {
            if (listFile[i].isFile()){ //kiểm tra nó có phải file ko 
                if (listFile[i].getName().equals(fileName)) {
                    result = listFile[i];
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(findFileByName("C:\\Users\\Dk\\Documents","new 1.txt"));
        System.out.println(readContentFromFile("C:\\Users\\Dk\\Documents\\new 1.txt"));
        //writeContentToFile("C:\\Users\\Dk\\Documents\\new 1.txt");
        //writeContentToFilenoDelete("C:\\Users\\Dk\\Documents\\new 1.txt");
    }

}
