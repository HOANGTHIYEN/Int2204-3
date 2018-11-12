import java.io.*;
import java.util.Scanner;

public class main {
    public static String readContentFromFile(String path) throws IOException{
        String s;
            File file = new File(path);
            FileReader reader = new FileReader(file);
            BufferedReader in = new BufferedReader(reader);
            s = in.readLine();
        return s;
    }

    public static void writeContentToFile(String path) throws IOException{
        File file = new File(path);
        FileWriter writer = new FileWriter(file.getName(), true);
        BufferedWriter out = new BufferedWriter(writer);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        out.write(s);
        out.close();
    }

    public static File findFileByName(String folderPath, String fileName) throws IOException{
        File file = new File(folderPath);
        if(file.exists()){
            if(file.isFile()){
                if(file.getName().endsWith(fileName)){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
        File[] listFile = file.listFiles();
        if(listFile != null){
            for(File i : listFile){
                if(i.getName().endsWith(fileName)) {
                    findFileByName(i.getAbsolutePath(), i.getName());
                }
            }
        }
        File result = new File(fileName);
        return result;
    }

    public static void main(String[] args){
        File file = new File("data.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println(readContentFromFile("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writeContentToFile("data.txt");
            System.out.println(readContentFromFile("data.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        File result = null;
        try {
            result = findFileByName("C:/Users/Admin/IdeaProjects/Lab09", "data.txt");
            System.out.println(readContentFromFile(result.getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}