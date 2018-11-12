package Lab9;

import java.io.*;

public class tuan9 {

	public static void main(String[] args) {
		String path = "E:\\tuan9\\textfile.txt";
		String folderPath = "E:\\tuan9";
		tuan9 t = new tuan9();
		
		System.out.print(t.readContentFromFile(path));
		
		 
		 
		 writeContentToFile(path);
		 System.out.println(" File sau khi ghi đè\n");
		 System.out.print(t.readContentFromFile(path));
		 
	      
		  writeContentToFile1(path);
		  System.out.println(" File sau khi ghi thêm\n");
		  System.out.print(t.readContentFromFile(path));
		  
		  
		

		 findFileByName(folderPath, "textfile.txt");
		
	}

	public static String readContentFromFile(String path) {
		File file = new File(path);

		
			String s = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line;

				while ((line = br.readLine()) != null) {
					s = s + line + "\n";

				}

				br.close();
				
			} catch (IOException e) {
				System.out.println("Error: " + e);
			}
			return s;
		
		
	}

	public static void writeContentToFile(String path) {
		File file;
		FileWriter fw;
		BufferedWriter bw;
		try {
			file = new File(path);

			if (!file.exists())
				file.createNewFile();

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			bw.write("ghi file ");
			
			System.out.println("ghi file thành công.");
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeContentToFile1(String path) {
		File file;
		FileWriter fw;
		BufferedWriter bw;
		try {
			file = new File(path);

			if (!file.exists())
				file.createNewFile();

			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);

			bw.write("\n ghi thêm file.");
			System.out.println("ghi thêm file thành công.");
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void findFileByName(String folderPath, String fileName) {
		File file = new File(folderPath);
	
		if (!file.exists()) {
			System.out.println("file ko tồn tại.");
		} else {
			
			if (file.isFile()) {
				
				if (file.getName().compareTo(fileName) == 0) {
					System.out.println("tìm thấy : " + file.getAbsolutePath());
				}
			} else {
				
				if (file.getName().endsWith(fileName)) {
					System.out.println("tìm thấy: " + file.getAbsolutePath());
				}
			}
			
			File[] listFile = file.listFiles();
			
			if (listFile != null) {
				for (File files : listFile) {
					
					findFileByName(files.getAbsolutePath(), fileName);

				}
			}
		}
	}
}
