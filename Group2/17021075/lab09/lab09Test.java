package lab09;

import java.io.*;
import java.util.Scanner;

public class lab09Test
{

    public static String readContentFromFile(String path) throws IOException
    {
        File file = new File(path);
        Scanner scan = new Scanner(file);
        String line;
        while(scan.hasNext()) 
        {
			line = scan.next();
			System.out.println(line);
        }
        return "";
    }
    public static void writeContentToFile(String path) throws IOException
    {
        File file = new File(path);
        PrintWriter file_writer = new PrintWriter(file);
        if (!file.exists()) 
			file.createNewFile();
        file_writer.write("174521118");
        file_writer.close();
    }
    public static void writeContentToFileNotDelete(String path) throws IOException
    {
    	File file = new File(path);
    	FileWriter fil = new FileWriter(file, true);
    	PrintWriter file_writer = new PrintWriter(fil);
        if (!file.exists()) 
			file.createNewFile();
        file_writer.println("\n");
        file_writer.append("174521118");
        file_writer.close();
    }
    public static File findFileByName(String folderPath, String fileName)
    {
        File file = new File(folderPath);
        if(file.isDirectory())
        {
            String[] list = file.list();
            for(String str : list)
                if(str.equals(fileName))
                    return new File(file.getAbsolutePath() + "\\" + fileName);
        }
        return null;
    }
    public static void main(String[] args) 
    {
        try {
            System.out.println(readContentFromFile("C:\\Users\\ASUS\\Desktop\\Lab09\\In.txt"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            writeContentToFile("C:\\Users\\ASUS\\Desktop\\Lab09\\Outb.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            writeContentToFileNotDelete("C:\\Users\\ASUS\\Desktop\\Lab09\\Outc.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if(findFileByName("C:\\Users\\ASUS\\Desktop\\Lab09", "In.txt") != null)
            System.out.println(findFileByName("C:\\Users\\ASUS\\Desktop\\Lab09", "In.txt").getAbsolutePath());
        else
        	System.out.println("File Not Found");
    }
}
