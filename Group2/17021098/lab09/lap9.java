/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author CCNE
 */
public class Lap9{

    /**
     * @param args the command line arguments
     */
    public static String readContentFromFile(String path) throws FileNotFoundException, IOException {
       
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = new String();
        line = br.readLine();
        return line;
    }
    public static void writeContentToFile(String path)  throws IOException{
        File file = new File(path);
        String s= new String();
        try{
            FileWriter fw = new FileWriter(file,true);
            fw.write(s);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
    public static String findFileByName(String folderPath, String fileName) {
       
        File file=new File(folderPath);
        String[] arrFile= file.list();
        if(arrFile == null)  System.out.println(" file k ton tai");
        else for(int i=0;i<arrFile.length;i++)  {
            if(arrFile[i].equals(fileName)){
                return arrFile[i];
            }
        }
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException  {
        System.out.println(readContentFromFile("C:\\Users\\CCNE\\Downloads\\tu.txt"));
    }
}