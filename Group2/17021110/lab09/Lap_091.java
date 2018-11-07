/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Admin
 */
public class Lab09 {

    /**
     * @param args the command line arguments
     */
     public static String readContentFromFile(String path){
   try {
     
     File f = new File(path);
     FileReader fr = new FileReader(f);

     
     BufferedReader br = new BufferedReader(fr);
     String line;
     while ((line = br.readLine()) != null){
       System.out.println(line);
     }

     
     fr.close();
     br.close(); 
    } catch (Exception ex) {
      System.out.println("Loi doc file: "+ex);
  }
         return null;
     }
      public static void writeContentToFile(String path){
       try {
      FileWriter a = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(a);
        bw.write("tran van");
    
     bw.close();
     a.close();
   } catch (IOException ex) {
     System.out.println("Loi ghi file: " + ex);
 }
      
      }
      
      public static File findFileByName(String folderPath, String fileName){
        File f = new File(folderPath+"//"+fileName);
        if (f.exists()){
            return f;
        }
        else
            return null;
    } 
      
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(readContentFromFile("C:\\Users\\CCNE\\Downloads\\tuan.txt"));
        writeContentToFile("C:\\Users\\CCNE\\Downloads\\tuan1.txt");
        findFileByName("C:\\Users\\CCNE\\Downloads","tuan.txt");
    }
    
}