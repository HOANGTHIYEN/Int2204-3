package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static String readContentFromFile(String path) throws IOException {
        String reader="";
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));         //đọc văn bản từ 1 input stream dựa trên các character
        String line = br.readLine();
        while (line != null){
            reader += line + "\n";
            line = br.readLine();
        }
        br.close();
        return reader;
    }

    public static void writeContentToFile(String path) throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path))); //Tất cả nội dung sẽ bị ghi đè khi dùng FileWrite
            bw.write("INT22033");
            bw.close();
        }catch(IOException e){
            System.err.println("getMessage():" + e.getMessage());
        }
    }
    //Giữ nội dung đã có của file và tiếp tục ghi thêm nội dung mới vào cuối file
    public static void writeContentToFileAppend(String path) throws IOException{
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path), true));
            bw.newLine();
            bw.append("INT22033");    //nối chuỗi tham số đã cho với chuỗi này
            bw.close();
        } catch (IOException e) {
            System.err.println("getMessage():" + e.getMessage());
        }
    }

    public static File findFileByName(String folderPath, String fileName) throws IOException{
        File file = new File(folderPath);
        if(file.isDirectory() == true){        //kiểm tra thư mục trống
            String[] listFile = file.list();
            for(String name : listFile)
                if(name.equals(fileName))
                    return new File(file.getAbsolutePath() + "\\" + fileName);
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
	// test ý a
        String path1 = "C:/Users/Admin/IdeaProjects/lab09/src/com/company/file1.txt";
        String path2 = "C:/Users/Admin/IdeaProjects/lab09/src/com/company/file2.txt";
        String linkFolder = "C:/Users/Admin/IdeaProjects/lab09";
        String file = "file.txt";
        try {
            System.out.println(readContentFromFile(path1));
        }catch(IOException e){
            System.err.println("getMessage():" + e.getMessage());
        }

    //test ý b

        writeContentToFile(path2);

    //test ý c

        writeContentToFileAppend(path1);

    //test ý d
        try {
                System.out.println("Path File : " + findFileByName(linkFolder, file).getAbsolutePath());
        }catch(IOException e){
            System.err.println("getMessage():" + e.getMessage());
        }
    }

}
