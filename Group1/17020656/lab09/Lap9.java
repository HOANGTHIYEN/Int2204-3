/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Admin
 */
public class Lap9 {

    /**
     * @param args the command line arguments
     */
    public static String readContentFromFile(String path)
    {
        try
        {
            File File1 = new File(path);
            FileReader fr = new FileReader(File1);
            BufferedReader br = new BufferedReader(fr);
            String text;
            while ((text = br.readLine()) != null)
            {
                System.out.println(text);
            }
            fr.close();
            br.close(); 
        }
        catch (Exception ex) 
        {
            System.out.println("Error: "+ex);
        }
        return null;
    }
    
    public static void writeContentToFile(String path)
    {
        try 
        {
            FileWriter File2 = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(File2);
            bw.write("OOP");
    
            bw.close();
            File2.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("Error: " + ex);
        }
        
        
    }
    
    public static void writeContentToFileAdd(String path)
    {
        try 
        {
            FileWriter FileAdd = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(FileAdd);
            bw.write("OOP");
    
            bw.close();
            FileAdd.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("Error: " + ex);
        }
        
        
    }
    
    public static File findFileByName(String folderPath, String fileName)
    {
        File File3 = new File(folderPath+"//"+fileName);
        if (File3.exists())
        {
            System.out.println("OK");
            return File3;
        }
        else
        {
            System.out.println("NO");
            return null;
        }
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(readContentFromFile("D:\\vnu.txt"));
        writeContentToFile("D:\\vnu.txt");
        writeContentToFileAdd("D:\\vnu1.txt");
        findFileByName("D:\\", "vnu.txt");
    }
    
}
