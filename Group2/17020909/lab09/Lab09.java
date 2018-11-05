/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

/**
 *
 * @author CCNE
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.io.IOException;

public class Lab09 {
    
    public static String readContentFromFile(String path) throws IOException {
        File F = new File(path);
        FileReader Fr = new FileReader(F);
        String S=null;
        int i=Fr.read();
        while (i != -1) {
            S = S + (char) i;
        }
        Fr.close();
        return S;
    }
    
    public static void writeContentToFile(String path) throws IOException {
        File F = new File(path);
        FileWriter Fr = new FileWriter(F);
        BufferedWriter Bw = new BufferedWriter(Fr);
        Bw.write("Hello World!");
        Bw.close();
    }
    
    public static void writeContentToFileAdd(String path) throws IOException {
        File F = new File(path);
        FileWriter Fr = new FileWriter(F, true);
        BufferedWriter Bw = new BufferedWriter(Fr);
        Bw.write("Hello World!");
        Bw.close();
    }
    
    public static File findFileByName(String folderPath, String fileName) throws IOException {
        File F = new File(folderPath);
        File S = null;
        if (F.exists())
           if (F.isFile())
               if ((folderPath.compareTo(fileName))==0)
                   S = F;
        File[] List = F.listFiles();
        if (List != null) 
            for (File i : List) 
                if ((i.getName().compareTo(fileName))==0)
                   return S = i;
        return S;
    }
    
    public static void main(String[] args) {
        
    }
    
}
