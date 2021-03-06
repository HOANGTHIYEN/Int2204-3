/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Genius
 */
public class Lab09 {

    /**
     * @param path
     * @return 
     * @throws java.io.IOException 
     */
    public static String readContentFromFile(String path) throws IOException{
        File f = new File(path);
        FileReader fr = new FileReader(f);
        BufferedReader bd = new BufferedReader(fr);
        String line = bd.readLine();
        bd.close();
        return line;
    }
    public static void writeContentToFile(String path) throws IOException{
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Nguyen Van Truong");
        bw.close();
    }
    public static void writeContentToFileAppend(String path) throws IOException{
        File f = new File(path);
        FileWriter fw = new FileWriter(f, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.newLine();
        bw.append("\nNguyen Van Truong");
        bw.close();
    }
    public static File findFileByName(String folderPath, String fileName){
        File f = new File(folderPath);
        if(f.isDirectory()){
            String[] l = f.list();
            for(String s : l)
                if(s.equals(fileName))
                    return new File(f.getAbsolutePath() + "\\" + fileName);
        }
        return null;
    }
    public static void main(String[] args) {
        //test 1.a
        try {
            // TODO code application logic here
            System.out.println(readContentFromFile("C:\\Users\\Genius\\Documents\\d.txt"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //test 1.b
        try {
            writeContentToFile("C:\\Users\\Genius\\Documents\\d.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //test 1.c
        try {
            writeContentToFileAppend("C:\\Users\\Genius\\Documents\\d.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //test 1.d
        if(findFileByName("C:\\Users\\Genius\\Documents", "sound.vbs") != null)
            System.out.println(findFileByName("C:\\Users\\Genius\\Documents", "sound.vbs").getAbsolutePath());
    }
}