/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09;

 import java.io.*;
import java.util.Scanner;
public class Lab09 {

     public static String readContentFromFile(String path)throws IOException
     {
         File file=new File(path);
         FileReader reader=new FileReader(file);
         BufferedReader in= new BufferedReader(reader);
         String ar =in.readLine();
         return ar;
     }
     public static String writeContentFromFile(String path)throws IOException
     {
         File file=new File(path);
         FileWriter writer=new FileWriter(file);
         BufferedWriter out= new BufferedWriter(writer);
         Scanner scanner=new Scanner(System.in);
         String ar =scanner.nextLine();
         out.write(ar);
         out.close();
         return null;
     }
     public static File findFileByName(String folderPath,String fileName) throws IOException
     {
         File file=new File(folderPath);
         if(file.exists())
         {
             if(file.isFile())
             {
                 if(file.getName().endsWith(fileName))
                 {
                     System.out.println(file.getAbsolutePath());
                 }
             }
         }
         File[] listFile=file.listFiles();
         if(listFile!=null)
         {
             for(File i: listFile)
             {
                 if(i.getName().endsWith(fileName))
                 {
                     findFileByName(i.getAbsolutePath(),i.getName());
                 }
             }
         }
         File result= new File(fileName);
         return result;
     }
    public static void main(String[] args) throws IOException  {
        // TODO code application logic here
        Lab09 x=new Lab09();
       
        
            System.out.println(x.readContentFromFile("diep.txt"));
        
      
            x.writeContentFromFile("diepout.txt");
         
        
       File result=null;
        result=findFileByName("C:\\Users\\Dell\\Desktop\\lab09","diepout.txt");
    }
}

     