package Lab9;

import java.io.*;

public class Lab9 {

    public static void main(String[] args) {
        String path = "C:\\Users\\CCNE\\Downloads\\omaewamoushinderu.txt";
        String folderPath = "C:\\Users\\CCNE\\Downloads\\alpha.txt";
        String fileName = "alpha.txt";
        readContentFromFile(path);
        System.out.println("Ghi lại vào File");
        writeContentToFile(path, false);
        System.out.println("Nội dung file mới: ");
        readContentFromFile(path);
        System.out.println("Ghi tiếp vào File");
        writeContentToFile(path, true);
        System.out.println("Nội dung file mới: ");
        readContentFromFile(path);
        findFileByName(folderPath, fileName);
    }

    public static String readContentFromFile(String path) {
        File file = new File(path);
        // Kiểm tra tồn tại file
        if (!file.exists()) return "Không tìm thấy file";
        // Đếm số dòng
        int count = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            // Đọc dữ liệu từng dòng
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count ++;
            }
            System.out.println("Đã đọc xong, " + count + " dòng!");
            br.close();
        } catch (IOException e) {
            return "Lỗi: " + e;
        }
        return "";
    }

    public static void writeContentToFile(String path, Boolean append)
    {
        File file;
        FileWriter fw;
        BufferedWriter bw;
        try {
             file = new File(path);
             // Kiểm tra xem có file không nếu không tạo file mới
            if (!file.exists())
                file.createNewFile();

            fw = new FileWriter(file, append);
            bw = new BufferedWriter(fw);
            // Write in file
            bw.write("Fallschirmjaeger");
            System.out.println("Xong!");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        // Kiểm tra tồn tại file hay tệp không
        if (!file.exists()) {
            System.out.println("Folder wa nani desuka???");
        }
        else {
            // Kiểm tra đường dẫn file
            if(file.isFile()){
                // So sánh với tên tệp cần tìm
                if(file.getName().endsWith(fileName)){
                    System.out.println("Founded: " + file.getAbsolutePath());
                }
            } else {
                // Trả về tệp tìm thấy
                if (file.getName().endsWith(fileName)) {
                    System.out.println("Founded: " + file.getAbsolutePath());
                }
            }
            // Tạo danh sach file hay tệp trên đường dẫn nguồn
            File[] listFile = file.listFiles();
            // Kiểm tra danh sách rỗng
            if (listFile != null){
                for (File files : listFile){
                    // Đệ quy
                    findFileByName(files.getAbsolutePath(), fileName);
                }
            }
        }
    }
}
