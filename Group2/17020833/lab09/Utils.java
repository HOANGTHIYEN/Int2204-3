package community.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {
	public static String readContentFromFile (String path) throws IOException 
	{
			FileReader fr = new FileReader (path);
			BufferedReader br = new BufferedReader(fr);
			String line= br.readLine(); 
			while (line !=  null)
			{
				System.out.println(line );
				line =br.readLine();
			}
				return  "" ;	 
	}
	public static void writeContentToFile(String path) throws IOException
	{
		FileWriter fw =new FileWriter(path,false);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello !");
		bw.close();
		
	}
	public static void writeContentToFile1(String path) throws IOException
	{
		FileWriter fw =new FileWriter(path,true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(" Ha Noi!");
		bw.close();
		
 	}
	 public static File findFileByName(String folderPath, String fileName)
	 {
		 File file  = new File (folderPath);
		 if (file.isDirectory())
		 {
		 File [] list = file.listFiles();
		 if (list !=null)
		 {
			 for (File f :list)
			 {
				 if (f.getName().endsWith(fileName))
					 return new File (f.getAbsolutePath()+":"+fileName) ;
			 }
		 }
		 }
		 return null;
	 }
	 

	public static void main(String[] args) {
		try 
		{
		System.out.println(readContentFromFile("C:\\Users\\DELL\\Downloads\\input.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			writeContentToFile("C:\\Users\\DELL\\Downloads\\input.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			writeContentToFile1("C:\\Users\\DELL\\Downloads\\input.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(findFileByName("C:\\Users\\DELL\\Downloads\\an", "hola.txt"));
				
	}

}
