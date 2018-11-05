package Main;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static String readContentFromFile(String path) {
        try {
            FileInputStream fis = new FileInputStream(new File(path));
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String line;
            String para = "";
            while ((line = br.readLine()) != null) {
                para += line + "\n";
            }
            br.close();
            return para;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeContentToFile(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            String content = "hello\nworld1";
            bw.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContinueContentToFile(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            String content = "\nhello\nworld2";
            bw.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName) {
        Path dir = Paths.get(folderPath);

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir, fileName)) {
            for (Path entry : stream) {
                return entry.toFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // write your code here
        try {
            System.out.println("cau a\n");
            System.out.println(readContentFromFile("/home/sidz/school/ltnc/Int2204-3/Group2/17020998/lab09/lab09.txt"));
            System.out.println("cau b\n");
            writeContentToFile("/home/sidz/school/ltnc/Int2204-3/Group2/17020998/lab09/lab09.txt");
            System.out.println(readContentFromFile("/home/sidz/school/ltnc/Int2204-3/Group2/17020998/lab09/lab09.txt"));
            writeContinueContentToFile("/home/sidz/school/ltnc/Int2204-3/Group2/17020998/lab09/lab09.txt");
            System.out.println(readContentFromFile("/home/sidz/school/ltnc/Int2204-3/Group2/17020998/lab09/lab09.txt"));
            System.out.println("cau c\n");
            File x = findFileByName("/home/sidz/school/ltnc/Int2204-3/Group2/17020998/lab09", "lab09.txt");
            System.out.println(readContentFromFile(x.getPath()));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
