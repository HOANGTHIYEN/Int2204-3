package lab09;

import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class lab09 {
	public static String readContentFromFile(String path)
	{
		StringBuilder line = new StringBuilder();
	    try 
	    {
	    	Stream<String> stream = Files.lines( Paths.get(path));
	        stream.forEach(s -> line.append(s).append("\n"));
	        stream.close();
	    }
	    catch (IOException e)
	    {
	        System.out.println("Khong doc duoc");
	    }
	    return line.toString();
	}
	
	 public static void writeContentToFile(String path)
	 {
		 try
		 {
		 	FileOutputStream fos = new FileOutputStream(path);
	        OutputStreamWriter osw = new OutputStreamWriter(fos);
	        osw.flush();
	        fos.flush();
	        osw.write("noi dung moi da ghi \n");
	        
	       
	        osw.close();
		 } catch (IOException e)
		    {
		        System.out.println("Khong ghi duoc");
		    }
	 }
	 public static void writeToFile(String path)
	 {
		 try
		 {
			 FileOutputStream fos = new FileOutputStream(path,true);
		        OutputStreamWriter osw = new OutputStreamWriter(fos);
		        osw.write("ghi ti?p file có s?n \n");
		        
		        osw.flush();
		        fos.flush();
	        osw.close();
		 } catch (IOException e)
		    {
		        System.out.println("Khong ghi duoc");
		    }
	 }
	
	 public static File findFileByName(String folderPath, String fileName) {
		 File file = new File(folderPath);
	        File[] listFile = file.listFiles();
	        for (File f : listFile){
	            if (f.toString().equals(folderPath+'\\'+fileName)){
	                return f;
	            }
	        }
	        return null;
	    
	    }
	 
	public static void main(String[] args)
	{
		
		writeContentToFile("D:\\lab09.txt");
		 writeToFile("D:\\lab09.txt");
		 File file = findFileByName("D","ten.txt");
	        System.out.println(file);
		System.out.println(readContentFromFile("D:\\ten.txt"));
	}
}