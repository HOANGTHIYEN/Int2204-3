/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class Lap_09 {

    /**
     * @param args the command line arguments
     */
    public static String readContentFromFile(String path) throws IOException{
        String s;
       FileInputStream input=new FileInputStream(path);
       BufferedReader br=new BufferedReader(new InputStreamReader(input));
       s=br.readLine();
           
       return s;
    }
    public static void writeContentToFile(String path) throws IOException{
        String s;
        Scanner sc =new Scanner(System.in);
        s=sc.nextLine();
        File file = new File(path);
        if(!file.exists())
           file.createNewFile();
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw =new BufferedWriter(fw);
            bw.write(s);
            bw.close();
            fw.close();

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
        // TODO code application logic here
        Lap_09 lap=new Lap_09();
        try {
            System.out.println(lap.readContentFromFile("input.txt"));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            lap.writeContentToFile("output.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
       if(findFileByName("D:\\lap tring java\\lap_09", "output.txt") != null)
            System.out.println(findFileByName("D:\\lap tring java\\lap_09", "output.txt").getAbsolutePath());
    }
    
}
