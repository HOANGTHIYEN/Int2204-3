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
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Lab09 {
    public static String readContentFromFile(String path) throws FileNotFoundException, IOException
    {
        BufferedReader input = new BufferedReader(new FileReader(path));
        String sCurrentLine;
        String result = "";
			while ((sCurrentLine = input.readLine()) != null) {
				//System.out.println(sCurrentLine);
                                result+= sCurrentLine +"\n";
                        }
        return result;                
    }
    public static void writeContentToFile(String path) throws FileNotFoundException, IOException
    {
        BufferedWriter bw = null;
      try {
	 String mycontent = "hello hi alo" ;
	 File file = new File(path);
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  FileWriter fw = new FileWriter(file);
	  bw = new BufferedWriter(fw);
	  bw.write(mycontent);
          System.out.println("File written Successfully");

      } catch (IOException ioe) {
	   ioe.printStackTrace();
	}
	finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(Exception ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	}
   }
    public static void writeContentToFileContinue(String path) throws FileNotFoundException, IOException
    {
        BufferedWriter bw = null;
      try {
	 String mycontent = "\nhello hi alo" ;
	 File file = new File(path);
	  if (!file.exists()) {
	     file.createNewFile();
	  }

	  FileWriter fw = new FileWriter(file,true);
	  bw = new BufferedWriter(fw);
	  bw.write(mycontent);
          System.out.println("File written Successfully");

      } catch (IOException ioe) {
	   ioe.printStackTrace();
	}
	finally
	{ 
	   try{
	      if(bw!=null)
		 bw.close();
	   }catch(Exception ex){
	       System.out.println("Error in closing the BufferedWriter"+ex);
	    }
	}
   }
public static File findFileByName(String folderPath, String fileName)
    {

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
            System.out.println("source không tồn tại");
        }
        return file;
    }   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        writeContentToFile("C:\\Users\\CCNE\\Documents\\NetBeansProjects\\Lap9\\write.txt");
        writeContentToFileContinue("C:\\Users\\CCNE\\Documents\\NetBeansProjects\\Lap9\\write.txt");
        findFileByName("C:\\Users\\CCNE\\Documents\\NetBeansProjects\\Lap9","write.txt");
        //System.out.println(readContentFromFileWithFile(findFileByName("C:\\Users\\CCNE\\Documents\\NetBeansProjects\\Lap9","write.txt")));
        System.out.println("---------------------------------------------------");
        System.out.println(readContentFromFile("C:\\Users\\CCNE\\Documents\\NetBeansProjects\\Lap9\\write.txt"));
    }
    
}
    
}

