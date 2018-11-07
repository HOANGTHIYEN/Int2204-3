package com.lab09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class UTils {
	public static String readContentFromFile(String path) throws IOException {
		ArrayList<String > obj = new ArrayList<String>();
	File file = new File(path);
	FileReader fr = null;
	int count=0;
	try {
	
		fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		String str=null;
		while((str=br.readLine())!=null) {
			count++;
			obj.add(str);}
		br.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
		System.out.println(count);
		return "";
	}
	public static void writeContentToFile(String path) throws IOException {
		File file = new File(path);

		FileWriter fw = null;
		try {
			fw = new FileWriter(file,false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\r\ntat ca cac loai");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	public static void writeContentToFile1(String path) throws IOException {
		File file = new File(path);

		FileWriter fw = null;
		try {
			fw = new FileWriter(file,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("\r\ntat ca cac lao");

			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void findFileByName(String folderPath, String fileName) {
	    File file = new File(folderPath);
	    if(file.isFile()) {
	    	if(file.getName().endsWith(fileName)) {
	    		System.out.println(file.getAbsolutePath());
	    	}
	    }
	    else {
	    	if(file.getName().endsWith(fileName)) {
	    		System.out.println(file.getAbsolutePath());
	    	}
	    }
	    File[] listfile = file.listFiles();
	    if(listfile !=null) {
	    for(File file1 :listfile) {
	    	findFileByName(file1.getAbsolutePath(), fileName);
	    }
	    }/*
	    FilenameFilter filter = new FilenameFilter() {
			
			@Override
			public boolean accept(File file, String name) {
				return name.equals("txt");
			}
		};*/

	}
	//MVNreporsity
}

