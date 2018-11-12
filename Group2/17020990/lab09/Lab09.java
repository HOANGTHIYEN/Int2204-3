/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Quoc
 */
public class Lab09 {

    /**
     * @param path
     * @return 
     * @throws java.io.IOException
     */
    public static String readContentFromFile(String path) throws IOException {
        File f= new File(path);
        FileReader fr= new FileReader(f);
        String line;
        try (BufferedReader br = new BufferedReader(fr)) {
            line = br.readLine();
        }
        return line;
    }
    public static void writeContentToFile(String path) throws IOException{
        File f = new File(path);
        FileWriter fw = new FileWriter(f);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("1111");
        }
    }
    public static void writeContentToFileApp(String path) throws IOException{
        File f = new File(path);
        FileWriter fw = new FileWriter(f, true);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.newLine();
            bw.append("2222");
        }
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
    public static void main(String[] args){
        //doc ra tu file
        try {
            readContentFromFile("C:\\Users\\Quoc\\Documents\\NetBeansProjects\\Lab09\\src\\lab09\\Quoc.txt");
            System.out.println(readContentFromFile("C:\\Users\\Quoc\\Documents\\NetBeansProjects\\Lab09\\src\\lab09\\Quoc.txt"));
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //xoa het noi dung trong file, ghi cai moi
        try {
            writeContentToFile("C:\\Users\\Quoc\\Documents\\NetBeansProjects\\Lab09\\src\\lab09\\Quoc.txt");
        } 
        catch (IOException e) {
           System.out.println(e.getMessage());
        }
        //ghi tiep noi dung file
        try {
            writeContentToFileApp("C:\\Users\\Quoc\\Documents\\NetBeansProjects\\Lab0"
                    + "9\\src\\lab09\\Quoc.txt");
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if(findFileByName("C:\\Users\\Quoc\\Documents\\NetBeansProjects\\Lab09\\src\\lab09\\Quoc.txt", "sound.vbs") != null)
            System.out.println(findFileByName("C:\\Users\\Quoc\\Documents\\NetBeansProjects\\Lab09\\src\\lab09\\Quoc.txt", "sound.vbs").getAbsolutePath());
        
    }
}
