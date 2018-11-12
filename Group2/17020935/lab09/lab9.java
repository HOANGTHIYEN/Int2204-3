package lab09;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class lab09 {
	public static String readContentFromFile(String path) throws IOException {
		String text = "";
		Scanner read = new Scanner(new FileInputStream(path),"UTF-8");
		String line;
		while(read.hasNextLine()) {
			line = read.nextLine();
			text = line.trim();
		}
		return text;
	}
	
	public static void writeContentToFile(String path) throws IOException {
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		dos.writeBytes(text);
		fos.close();
		dos.close();
	}
	
	public static void writeContentToFile2(String path) throws IOException {
		String text1 = readContentFromFile("C:\\Users\\g1\\eclipse-workspace\\OOP\\src\\lab09\\lab09.txt");
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dos = new DataOutputStream(fos);
		Scanner sc = new Scanner(System.in);
		String text2 = sc.nextLine();
		dos.writeBytes(text1+"\t"+text2);
		System.out.println("Compelete.");
		fos.close();
		dos.close();
	}
	
	public static File findFileByName(String folderPath, String fileName) {
		File file = new File(folderPath);
		if(file.exists() == true) {
			if(file.isFile()) {
				if(file.getName().startsWith(fileName)) {
					System.out.println(file.getAbsolutePath());
				}
			}
			File[] listFile = file.listFiles();
			if(listFile != null) {
				for(File f : listFile) {
					findFileByName(f.getAbsolutePath(),fileName);
				}
			}
		}
		else {
			System.out.println("not find folder");
		}
		return file;
	}
	public static void main(String[] agrs) throws IOException {
		String path = "C:\\Users\\g1\\eclipse-workspace\\OOP\\src\\lab09\\lab09.txt";
		System.out.println(readContentFromFile(path));
		findFileByName("src","text");
	}
	
}