package lab9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Utils {
	
	public static String readContentFromFile (String path) throws IOException {
		
		//đưa về chuẩn utf-8
		String content = new String(Files.readAllBytes(Paths.get(path)),StandardCharsets.UTF_8);
//		FileInputStream fin = null;
//    in bang cach doc tung ky tu trong file
//        try {  	
//        	File file = new File(path);
//        	if (!file.exists()) {			// kiem tra file neu ko ton tai thi tao file moi
//        		file.createNewFile();
//			}
//            fin = new FileInputStream(path);
//            int i = 0;
//            while ((i = fin.read()) != -1) {
//                System.out.print((char) i);
//            }
//            fin.close();	
//        } catch (Exception e) {
//            System.out.println(e);
//        } finally {
//            fin.close();
//        }
        return content;
    }
	public static String readContentFromFileByFile (File path) throws IOException {
		FileInputStream fin = null;
        try {
        	
        	
//        	File file = new File(path);
//        	if (!file.exists()) {			// kiem tra file neu ko ton tai thi tao file moi
//        		file.createNewFile();
//			}
        	
            fin = new FileInputStream(path);
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fin.close();
        }
        return "";
    }
	public static void writeContentToFile(String path) throws IOException {
		/*--------------------------Cách 1------------------------------*/
//		FileOutputStream File = null;
//		try {
//			File = new FileOutputStream(path);
//			String a;
//			Scanner Scan = new Scanner(System.in);
//			 System.out.print("Nhap chuoi can them vao File: "); 
//			a=Scan.nextLine();
//			byte b[]=a.getBytes();
//			File.write(b);
//			File.close();
//		}catch (Exception e) {
//			// TODO: handle exception
//			 System.out.println(e);
//		}
//		finally {
//            File.close();
//        }
		
		/*--------------------------Cách 2------------------------------*/
		BufferedWriter bw = null;
		FileWriter fw = null;
		try {
			
			String data ;
			System.out.print("Nhap chuoi can them vao File: "); 
			Scanner nhap=new Scanner(System.in);
			data=nhap.nextLine();
			File file = new File(path);
 
			// kiểm tra nếu file chưa có thì tạo file mới
			if (!file.exists()) {
				file.createNewFile();
			}
			// true = append file
			fw = new FileWriter(file.getAbsoluteFile(),true); // bỏ True thì sẽ xóa data trong file và thêm mới
			bw = new BufferedWriter(fw);
			bw.write(data);
			System.out.println("Đã Thêm Xong");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
	public static File findFileByName(String folderPath, String fileName) throws IOException
	{
		String a = "E:\\"+folderPath+"\\"+fileName;
		File file =new File(a);
		if (file.exists()) {			// kiem tra file neu ko ton tai thi tao tra ve file do
    		return file;
		}
		else
			return null;
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		String a = "E:\\OOP\\NewFile.txt";
		System.out.println(readContentFromFile(a));
		writeContentToFile(a);
		
		
		String folderPath=null,filename=null;
		Scanner nhap=new Scanner(System.in);
		folderPath=nhap.nextLine();
		filename=nhap.nextLine();

		if(findFileByName(folderPath,filename)!=null)
		{
			System.out.println("found File");
		}
		else
			System.out.println("cannot find File");

	}
	
	
	
	
	
}

