/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap_lap10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Nguyễn Thúy
 */
public class Utils {
    public static String readContentFromFile(String path) throws IOException{
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader bufferedreader = new BufferedReader(fr);
        String line = bufferedreader.readLine();
        bufferedreader.close();
        return line;
    }
    public static void writeContentToFile(String path) throws IOException{
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bufferedwriter = new BufferedWriter(fw);
        bufferedwriter.write("File Nguyen Hong Thai");
        bufferedwriter.close();
        System.out.println("Success...");
    }
    public static void writeContinueContentToFile(String path) throws IOException{
        File f = new File(path);
        FileWriter filewriter = new FileWriter(f, true);
        BufferedWriter bwr = new BufferedWriter(filewriter);
        bwr.newLine();
        bwr.append("\nHello everybody");
        bwr.close();
    }
    
    public static File findFileByName(String folderPath, String fileName){
        File f = new File(folderPath);
        if(f.isDirectory()){
            String[] l = f.list();
            for(String string : l){
                if(string.equals(fileName)){
                    return new File(f.getAbsolutePath() + "\\" + fileName);
                }
                File f2 = findFileByName(f.getAbsolutePath() + "\\" + string, fileName);
                if(f2 != null)
                    return f2;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        try {
            // TODO code application logic here
            readContentFromFile("C:\\Users\\User\\Documents\\NetBeansProjects\\filelap9.txt");
            System.out.println(readContentFromFile("C:\\Users\\User\\Documents\\NetBeansProjects\\filelap9.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
       
        try {
            writeContentToFile("C:\\Users\\User\\Documents\\NetBeansProjects\\filelap9.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        try {
            writeContinueContentToFile("C:\\Users\\User\\Documents\\NetBeansProjects\\filelap9.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        if(findFileByName("C:\\Users\\User\\Documents\\NetBeansProjects", "hoc.txt") != null)
            System.out.println(findFileByName("C:\\Users\\User\\Documents\\NetBeansProjects", "hoc.txt").getAbsolutePath());
    }
    
    }
