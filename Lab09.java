/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab09 {

    public static String readContentFromFile(String path) throws FileNotFoundException, IOException {
        BufferedReader input = new BufferedReader(new FileReader(path));
        String s;
        String result = "";
        while ((s = input.readLine()) != null) {

            result += s + "\n";
        }
        return result;
    }

    public static void writeContentToFile(String path) throws FileNotFoundException, IOException {
        BufferedWriter bw = null;
        try {
            String mycontent = "hello abcxyz ";
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(mycontent);
            System.out.println("File written Successfully");

        } catch (IOException ioe) {
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }

    public static void writeContentToFileContinue(String path) throws FileNotFoundException, IOException {
        BufferedWriter bw = null;
        try {
            String mycontent = "\nhiiiiiiiiiiiiiiiiiiiii";
            File file = new File(path);
            FileWriter fw = new FileWriter(file, true);
            bw = new BufferedWriter(fw);
            bw.write(mycontent);
            System.out.println("File written Successfully");

        } catch (IOException ioe) {
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        if (file.exists()) {
            if (file.isFile()) {
                if (file.getName().endsWith(fileName)) {
                    System.out.println(file.getAbsolutePath());
                }
            }
            File[] listFile = file.listFiles();
            if (listFile != null) {
                for (File f : listFile) {
                    findFileByName(f.getAbsolutePath(), fileName);
                }
            }
        } else {
            System.out.println("khong ton tai!");
        }
        return file;
    }

    public static void main(String[] args) throws IOException {

        System.out.println(readContentFromFile("C:\\Users\\nguyen ngoc gioi\\Documents\\NetbeansProjects\\Lab09\\file\\read.txt"));

        writeContentToFile("C:\\Users\\nguyen ngoc gioi\\Documents\\NetBeansProjects\\Lab09\\file\\write.txt");
        System.out.println(readContentFromFile("C:\\Users\\nguyen ngoc gioi\\Documents\\NetBeansProjects\\Lab09\\file\\write.txt"));

        writeContentToFileContinue("C:\\Users\\nguyen ngoc gioi\\Documents\\NetBeansProjects\\Lab09\\file\\write.txt");
        System.out.println(readContentFromFile("C:\\Users\\nguyen ngoc gioi\\Documents\\NetBeansProjects\\Lab09\\file\\write.txt"));

        findFileByName("file", "write.txt");
    }

}
