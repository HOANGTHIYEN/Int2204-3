package Lab09;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.FileNotFoundException;

public class Lab09 {
    public static String readContentFromFile(String path) throws IOException{
        String text="";

            Scanner read = new Scanner(new FileInputStream(path),"UTF-8");

            String line;
            while (read.hasNextLine()){
                line=read.nextLine();
                text=line.trim();
            }


        return text;
    }

    public static void writeContentToFile(String path)throws UnsupportedEncodingException,IOException{
        FileOutputStream fos;
        OutputStreamWriter osw;
        fos = new FileOutputStream(path,false);
        osw = new OutputStreamWriter(fos,"utf-8");

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        osw.write(text);

        osw.flush();
        fos.close();

    }

    public static void writeContentToFile_2(String path)throws  UnsupportedEncodingException,IOException{
        String text_last = readContentFromFile(path);
        FileOutputStream fos;
        OutputStreamWriter osw;
        fos = new FileOutputStream(path,false);
        osw = new OutputStreamWriter(fos,"utf-8");

        Scanner sc = new Scanner(System.in);
        String text_new = sc.nextLine();
        osw.write(text_last+ " " +text_new);

        osw.flush();
        fos.close();
    }

    public static File findFileByName(String folderPath, String filename){
        File file = new File(folderPath);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.getName().endsWith(filename)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    findFileByName(f.getAbsolutePath(), filename);
                }
            }
        } else {
            System.out.println("source không tồn tại");
        }
        return file;
    }

    public static void main(String args[])throws IOException{
        System.out.println(readContentFromFile("File/Test.txt"));
        //writeContentToFile("File/Test.txt");
        //writeContentToFile_2("file/Test.txt");
        findFileByName("File","abc.txt");
    }
}
