/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 123456789
 */


public class Utils {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String file ="C:\\Users\\123456789\\Documents\\NetBeansProjects\\Utils\\lab9.txt";
        String folderPath = "C:\\Users\\123456789\\Documents\\NetBeansProjects";
//        writeContentToFile(file);
        writeContentToFileAdd(file);
        readContentFromFile(file);
        findFileByName(folderPath,"lab9.txt");
    }
    public static String readContentFromFile(String path)
    {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            String contentLine = br.readLine();
            while(contentLine != null){
                
                System.out.println(contentLine);
                contentLine = br.readLine();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        finally{
            try{
                br.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        return null;
    }
    public static void writeContentToFile(String path){
        String content = "Clear and Write";
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(path));
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeContentToFileAdd(String path){
        String content = "\nAdd";
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(path,true));
            bw.write(content);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static File findFileByName(String folderPath,String fileName){
        File file = new File(folderPath);
        if(file.exists()){
            if(file.isFile()){
                if(file.getName().endsWith(fileName)){
                    System.out.println(file.getAbsolutePath());
                }
            }else{
            File[] listFile = file.listFiles();
            if(listFile != null){
                for(File f : listFile){
                    findFileByName(f.getAbsolutePath(),fileName);
                }
            }else {
                System.out.println("File Not Found!!!!!");
            }
            }
        }
        return file;
    }
}
