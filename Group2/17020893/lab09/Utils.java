package JavaWeek9;

import java.io.*;
import java.util.*;

public class Utils {

	static Scanner sc = new Scanner(System.in);
	static String path = "C:\\Users\\MyPC\\eclipse-workspace\\Java-OOP\\src\\JavaWeek9\\ducminh.txt";

	public static String readContentFromFile(String path) throws IOException {
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		StringBuilder sb = new StringBuilder();
		while (line != null) {
			sb.append(line).append("\n");
			line = br.readLine();
		}
		br.close();
		return sb.toString();
	}

	public static void writeContentToFile(String path) throws IOException {
		FileOutputStream fos = new FileOutputStream(new File(path));
		String s;
		System.out.println("Nhập từ muốn viết vào file: ");
		s = sc.nextLine();
		fos.write(s.getBytes());
		fos.close();
		System.out.println("Xong!");
	}

	public static void Menu() throws IOException {
		System.out.println("===============================================================\n");
		System.out.println("1 - Sử dụng hàm readContentFromFile");
		System.out.println("2 - Sử dụng hàm writeContentToFile");
		System.out.println("3 - Sử dụng hàm appendContentToFile");
		System.out.println("4 - Sử dụng hàm findFileByName");
		System.out.println("5 - Thoát");
		int choice;
		System.out.println("Your choice ?");
		while (true) {
			choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: {
				System.out.println(readContentFromFile(path));
				break;
			}
			case 2: {
				writeContentToFile(path);
				break;
			}
			case 3: {
				appendContentToFile(path);
				break;
			}
			case 4: {
				String folderPath;
				String fileName;
				System.out.println("Nhập đường dẫn cho folder");
				folderPath = sc.next();
				System.out.println("Nhập tên file muốn tìm kiếm");
				fileName = sc.next();
				findFileByName(folderPath, fileName);
				break;
			}
			default: {
				break;
			}
			}
			if (choice == 5) {
				break;
			}
		}
		sc.close();
	}

	public static void appendContentToFile(String path) throws IOException {
		FileWriter fw = new FileWriter(path, true);
		String append;
		System.out.println("Muốn thêm từ nào ?");
		append = sc.nextLine();
		// fw.write(System.lineSeparator() + append); // append after down the line
		fw.write(" " + append); // add on 1 line
		System.out.println("Xong!");
		fw.close();
	}

	public static File findFileByName(String folderPath, String fileName) throws IOException {
		File folder = new File(folderPath);
		for (File f : folder.listFiles()) {
			if (f.getName().contains(fileName)) {
				System.out.println("Đã Tìm Thấy");
				return new File(fileName);
			}
		}
		System.out.println("Không tìm thấy");
		return null;
	}

	public static void main(String[] args) throws IOException {	
		Menu();
	}
}
