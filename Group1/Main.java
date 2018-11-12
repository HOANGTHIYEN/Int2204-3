package com.lab09;

import java.io.IOException;


public class Main {
	private static 	final String path =("C:\\Users\\W540\\Documents\\book.txt");
	private static final String folderPath ="C:\\Users\\W540\\book";
    public static void main(String[] args) throws IOException {
		/*File dir = new File("Book");
		dir.mkdirs();
		if(dir.isDirectory()) {
			String[] dirContents = dir.list();
			for(int i=0;i< dirContents.length;i++) {
				System.out.println(dirContents[i]+"------"+dir.getAbsolutePath());
				
			}
		}*/
    	
    
    	//System.out.println(UTils.readContentFromFile(path));
    	//UTils.readContentFromFile(path);
    	//UTils.writeContentToFile(path);
        UTils.findFileByName(folderPath, "txt");
	}
}
